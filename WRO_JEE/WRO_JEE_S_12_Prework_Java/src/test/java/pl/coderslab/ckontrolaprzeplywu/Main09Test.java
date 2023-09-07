package pl.coderslab.ckontrolaprzeplywu;

import com.google.common.base.CharMatcher;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;

public class Main09Test {

    private static final Logger log = LoggerFactory.getLogger(Main09Test.class);
    private static final String EXPECTED_OUTPUT = "*\n" +
            "**\n" +
            "***\n" +
            "****\n" +
            "*****";

    private String output;

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Before
    public void setUp() {
        Main09.main(null);
        output = systemOutRule.getLog();
    }

    @Test
    public void whenRun_thenSystemOut_Stars() {
        assertEquals(EXPECTED_OUTPUT, CharMatcher.is(' ').removeFrom(EXPECTED_OUTPUT));
    }
}