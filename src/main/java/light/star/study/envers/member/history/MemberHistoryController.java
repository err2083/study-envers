package light.star.study.envers.member.history;

import lombok.RequiredArgsConstructor;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RepositoryRestController
@RequestMapping("/api/members/history")
@RequiredArgsConstructor
public class MemberHistoryController {

    private final MemberHistoryService memberHistoryService;

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return ResponseEntity.ok(memberHistoryService.findById(id));
    }

    @GetMapping("/rev/{id}")
    public ResponseEntity<?> findRev(@PathVariable Long id) {
        return ResponseEntity.ok(memberHistoryService.findRev(id));
    }
}