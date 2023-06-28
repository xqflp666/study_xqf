package top.xqf.template.test;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

public class SetofTest {
    private static final Logger logger = LoggerFactory.getLogger(SetofTest.class);

@Test
//题目1：输入一串字符串，判定字符串中出现过哪些字符
    public void test1(){
    //将输入的字符串分解成字符用数组装起来
      String s="zans44zzkw";
      int n=s.length();
      String sz[]=new String[n];
    //通过set集合唯一性，讲数组里面的值一一添加到set集合
      Set t=new HashSet<>();
      for (int i=0;i<n;i++) {
          sz[i] = s.substring(i, i + 1);
          t.add(sz[i]);
      }
    //展示的字符就是出现过的字符

      logger.debug("{}",t);

}


@Test
//题目2：题目1升级板。不单单要统计出现的字符，还要计算出现的次数
    public void test2(){
    //将输入的字符串分解成单个字符用字符串数组装起来
    String s="zans44zzkwdjejdheash";
    int n=s.length();
    String sz[]=new String[n];
    //通过map集合特点1.增删改查 2.键值对形式存在 3.key可以为空
    Map<String, Integer> m=new HashMap<>();
    for (int i=0;i<n;i++) {
        sz[i] = s.substring(i, i + 1);
            Integer value=m.get(sz[i]);
            //通过key可以为空，就可以以key为条件
            //key为空
            if(value==null){
                //表示字符第一次进来，把key从null改成1
                m.put(sz[i],1);
            }else {
                //key不为空
                //表示字符已经进来过了
                //通过特质1，在key的基础上加1
                m.put(sz[i], value + 1);
            }
        }
    //通过特质2，可以展示字符及其对应的出现次数
    logger.debug("{}",m);
    }
}

