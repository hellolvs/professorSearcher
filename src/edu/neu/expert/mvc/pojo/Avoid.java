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
 *         这个类是回避条件，依据传回来的参数反序列化字符串生成的javabean对象
 * @see edu.neu.expert.mvc.pojo.Requirement#avoid
 */
public class Avoid implements Serializable{
    private boolean bearCompany,partakeCompany,bearPerson,partakePerson,sameCompany,teacherStudent,fiveYear,judgeExpert,
    samePaper,sameAcheive,ssfabz,znbz,zpw;
    private String expertName = "";
    private String companyName = "";
    private String avoidId = "";


    public String getAvoidId () {
        return avoidId;
    }

    public void setAvoidId (String avoidId) {
        this.avoidId = avoidId;
    }


    public String getExpertName () {
        return expertName;
    }

    public void setExpertName (String expertName) {
        this.expertName = expertName;
    }

    public String getCompanyName () {
        return companyName;
    }

    public void setCompanyName (String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString () {
        return "Avoid{" +
                "bearCompany=" + bearCompany +
                ", partakeCompany=" + partakeCompany +
                ", bearPerson=" + bearPerson +
                ", partakePerson=" + partakePerson +
                ", sameCompany=" + sameCompany +
                ", teacherStudent=" + teacherStudent +
                ", fiveYear=" + fiveYear +
                ", judgeExpert=" + judgeExpert +
                ", samePaper=" + samePaper +
                ", sameAcheive=" + sameAcheive +
                ", ssfabz=" + ssfabz +
                ", znbz=" + znbz +
                ", zpw=" + zpw +
                ", expertName='" + expertName + '\'' +
                ", companyName='" + companyName + '\'' +
                ", avoidId='" + avoidId + '\'' +
                '}';
    }

    public boolean isBearCompany () {
        return bearCompany;
    }

    public void setBearCompany (boolean bearCompany) {
        this.bearCompany = bearCompany;
    }

    public boolean isPartakeCompany () {
        return partakeCompany;
    }

    public void setPartakeCompany (boolean partakeCompany) {
        this.partakeCompany = partakeCompany;
    }

    public boolean isBearPerson () {
        return bearPerson;
    }

    public void setBearPerson (boolean bearPerson) {
        this.bearPerson = bearPerson;
    }

    public boolean isPartakePerson () {
        return partakePerson;
    }

    public void setPartakePerson (boolean partakePerson) {
        this.partakePerson = partakePerson;
    }

    public boolean isSameCompany () {
        return sameCompany;
    }

    public void setSameCompany (boolean sameCompany) {
        this.sameCompany = sameCompany;
    }

    public boolean isTeacherStudent () {
        return teacherStudent;
    }

    public void setTeacherStudent (boolean teacherStudent) {
        this.teacherStudent = teacherStudent;
    }

    public boolean isFiveYear () {
        return fiveYear;
    }

    public void setFiveYear (boolean fiveYear) {
        this.fiveYear = fiveYear;
    }

    public boolean isJudgeExpert () {
        return judgeExpert;
    }

    public void setJudgeExpert (boolean judgeExpert) {
        this.judgeExpert = judgeExpert;
    }

    public boolean isSamePaper () {
        return samePaper;
    }

    public void setSamePaper (boolean samePaper) {
        this.samePaper = samePaper;
    }

    public boolean isSameAcheive () {
        return sameAcheive;
    }

    public void setSameAcheive (boolean sameAcheive) {
        this.sameAcheive = sameAcheive;
    }

    public boolean isSsfabz () {
        return ssfabz;
    }

    public void setSsfabz (boolean ssfabz) {
        this.ssfabz = ssfabz;
    }

    public boolean isZnbz () {
        return znbz;
    }

    public void setZnbz (boolean znbz) {
        this.znbz = znbz;
    }

    public boolean isZpw () {
        return zpw;
    }

    public void setZpw (boolean zpw) {
        this.zpw = zpw;
    }

    public boolean haveTrue () {
        if (bearCompany || partakeCompany || bearPerson || partakePerson || sameCompany || teacherStudent || fiveYear || judgeExpert ||
                samePaper || sameAcheive || ssfabz || znbz || zpw||companyName.trim().equals("") || expertName.trim().equals("")) {
            return true;
        } else {
            return false;
        }
    }
}
