package camt.se234.deployment.service;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GradeServiceImplTest {
    @Test
    public void testGetGrade(){
        GradeServiceImpl gradeService = new GradeServiceImpl();
        // 新规则示例：分数线整体上移（A/B/C/D/F 标准更严格）
        assertThat(gradeService.getGrade(100),is("A"));
        assertThat(gradeService.getGrade(89),is("A"));
        assertThat(gradeService.getGrade(88.9),is("B"));
        assertThat(gradeService.getGrade(80),is("B"));
        assertThat(gradeService.getGrade(79.9),is("C"));
        assertThat(gradeService.getGrade(70),is("C"));
        assertThat(gradeService.getGrade(69.9),is("D"));
        assertThat(gradeService.getGrade(60),is("D"));
        assertThat(gradeService.getGrade(59.9),is("F"));
        assertThat(gradeService.getGrade(0),is("F"));
    }
}