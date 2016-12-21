package edu.neu.expert.mvc.pojo;

/**
 * Created by tekieki on 2015/11/15.
 * email:skyritment@gmail.com
 * email:tekieki@foxmail.com
 */

import java.io.Serializable;

/**
 * @author 醉月
 *         <ul>
 *         <li><a href="http://weibo.com/skyritment" target="_blank">联系我</a></li>
 *         <li>email:tekieki@foxmail.com</li>
 *         </ul>
 *         Requirement类表示整个筛选条件，是由前端页面传回来json数据实体化的一个javabean，表示整个选择条件，
 *         其中avoid表示回避条件，expert表示添加专家中设置的条件。
 * @see edu.neu.expert.mvc.service.CoreService#generateSql(Requirement)
 */
public class Requirement implements Serializable {
    private Avoid avoid;
    private Expert expert;

    /**
     * @return 返回回避条件反序列化的对象，里面包含整个回避条件
     */
    public Avoid getAvoidCondition () {
        return avoid;
    }

    /**
     * @param avoid 表示整个回避条件，在反序列化的过程中，该函数由gson自动调用，在系统实现的过程中，没有进行过该函数的调用，也不推荐手动
     *              调用该函数
     */
    public void setAvoidCondition (Avoid avoid) {
        this.avoid = avoid;
    }

    /**
     * @return 返回添加专家条件反序列化的对象，里面包含整个添加专家的条件
     */
    public Expert getExpectCondition () {
        return expert;
    }

    /**
     * @param expect 表示整个添加专家条件，在反序列化的过程中，该函数由gson自动调用，在系统实现的过程中，没有进行过该函数的调用，也不推荐手动
     *               调用该函数
     */
    public void setExpertCondition (Expert expect) {
        this.expert = expect;
    }

    @Override
    public String toString () {
        return "Requirement{" +
                "avoidCondition=" + avoid +
                ", expectCondition=" + expert +
                '}';
    }
}
