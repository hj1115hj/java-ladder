package ladder.domain.ladder;

import ladder.domain.user.Name;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class LadderResultTest {

    @Test
    void 참가자명을_조회한다() {
        LadderResult ladderResult = new LadderResult();
        ladderResult.put(new Name("dugi"), "꽝");
        ladderResult.put(new Name("manse"), "3000");

        Map<Name, String> expected = new HashMap<>();
        expected.put(new Name("manse"), "3000");
        assertThat(ladderResult.getResults("manse")).isEqualTo(expected);
    }

    @Test
    void 존재하지_않는_참가자_예외() {
        LadderResult ladderResult = new LadderResult();
        ladderResult.put(new Name("dugi"), "꽝");
        ladderResult.put(new Name("manse"), "3000");

        assertThatThrownBy(() -> ladderResult.getResults("x"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("존재하지 않는 사용자 입니다.");
    }
}