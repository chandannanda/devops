package devops.numbers;

import org.junit.*;
import devops.numbers.NumberWords;
public class NumberWordsTests {
        private NumberWords numberWords ;
        @Before
        public void setup() {
                numberWords = new NumberWords() ;
        }
        @Test
        public void numberOutOfRangeReturnsError() {
                Assert.assertEquals( "Error", "Number out of range", numberWords.toWords( -1 ) ) ;
        }
        @Test
        public void numbertowordcase1() {
                Assert.assertEquals( "case1", " one", numberWords.toWords(1) ) ;
        }
        @Test
        public void numbertowordcase2() {
                Assert.assertEquals( "case2", " one hundred twenty three", numberWords.toWords(123) ) ;
        }
        @Test
        public void numbertowordonecase3() {
                Assert.assertEquals( "case3", " one thousand two hundred thirty four", numberWords.toWords(1234) ) 
;
        }
        @Test
        public void numbertowordonecase4() {
                Assert.assertEquals( "case4", " one million", numberWords.toWords(1000000) ) ;
        }
        @Test
        public void numbertowordonecase5() {
                Assert.assertEquals( "case5", "Number out of range", numberWords.toWords(99999999) ) ;
        }
        @Test
        public void numbertowordonecase6() {
		Assert.assertEquals( "case6", " three thousand three hundred thirty three", numberWords.toWords(3333) ) ;
        }
        @Test
        public void numbertowordonecase7() {
                Assert.assertEquals( "1", " thirteen", numberWords.toWords(13) ) ;
        }
}
                
