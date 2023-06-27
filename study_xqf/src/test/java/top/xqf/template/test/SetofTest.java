package top.xqf.template.test;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;

public class SetofTest {
    private static final Logger logger = LoggerFactory.getLogger(SetofTest.class);

@Test
//题目1：输入一串字符串，判定字符串中出现过哪些字符
    public void test1(){
      String s="zans44zzkw";
      int n=s.length();
      String chc[]=new String[n];
      Set t=new HashSet<>();
      for (int i=0;i<n;i++) {
          chc[i] = s.substring(i, i + 1);
          t.add(chc[i]);
      }
      logger.debug("{}",t);

}


@Test
//题目2：题目1升级板。不单单要统计出现的字符，还要计算出现的次数
    public void test2(){

}
}
