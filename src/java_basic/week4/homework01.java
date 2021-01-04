package java_basic.week4;
import org.kohsuke.github.*;
import java.io.IOException;
import java.util.HashMap;

import java.util.HashSet;
import java.util.List;
// 출력되는데 시간이 걸린다.
// 각 주차를 모두 돌기 때문에 ISSUE_COUNT는 18
public class homework01 {
    private static final int ISSUE_COUNT = 18;

    public static void main(String[] args) throws IOException {
        GitHub github = new GitHubBuilder().withOAuthToken("-").build(); // 사용할 때 마다 토큰 발급 받아야한다.
        GHRepository repository = github.getRepository("tbnsok40/live-study").getSource();
        GHIssue issue;
        List<GHIssueComment> comments;

        // hm은 for문 밖에서 선언 => 초기화 되면 안되는 객체
        HashMap<String, Integer> hm = new HashMap<>();

        for (int i = 1; i <= ISSUE_COUNT; ++i) {
            issue = repository.getIssue(i);
            comments = issue.getComments();
            HashSet<String> hs = new HashSet<>();
            String name = "";
            int size = comments.size();
            for(int j = 0; j < size; ++j) {
                try {
                    name = comments.get(j).getUser().getName();
                    if(name != null && !hs.contains(name)) {
                        hm.put(name, hm.getOrDefault(name, 0) + 1); // +1 은 각 주차마다 달은 댓글
                    };
                } catch (IOException e) {
                    System.out.println("작업 도중 오류가 발생 하였습니다. [" + i + " 주차, 이름 = " + name + "]");
                }
            }
        }
        System.out.println("========== 참여율 ==========");
        hm.forEach((s, i) -> System.out.printf("%-20s -> %.2f%%\n", s, (i / (float)ISSUE_COUNT * 100)));
    }
}

// 오름차순 정렬,