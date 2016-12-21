package edu.neu.expert.mvc.pojo;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by tekieki on 2015/11/15.
 * email:skyritment@gmail.com
 * email:tekieki@foxmail.com
 */

/**
 * @author 醉月
 *         <ul>
 *         <li><a href="http://weibo.com/skyritment" target="_blank">联系我</a></li>
 *         <li>email:tekieki@foxmail.com</li>
 *         </ul>
 *         这个类是添加专家条件以后，依据传回来的参数反序列化字符串生成的javabean对象
 * @see edu.neu.expert.mvc.pojo.Requirement#expert

 */
public class Expert implements Cloneable, Serializable{

    private Map<String,String> workType,jobTitle,qualification,companyScale,province, rank;
    private boolean scienCon,judExper, other;
    private String originLabel = "";
    private String andOrDomain = "";
    private int experNum;
    private String keyAndOr = "";
    private String fuzzyKey = "";
    private String key = "";
    private String avoidKey="";
    private String[][] domainDirect;
    private String[] tempdomainDirect;

    @Override
    public Object clone () throws CloneNotSupportedException {
        Expert o = ((Expert) super.clone());
        o.setRank(new HashMap<>(rank));
        o.setCompanyScale(new HashMap<>(companyScale));
        o.setJobTitle(new HashMap<String, String>(jobTitle));
        o.setWorkType(new HashMap<String, String>(workType));
        o.setQualification(new HashMap<String, String>(qualification));
        o.setProvince(new HashMap<String, String>(province));
        return o;
    }
    public void setTempdomainDirect (String[] tempdomainDirect) {
        this.tempdomainDirect = tempdomainDirect;
    }
    public void initnull () {
        if (workType==null) {
            workType = new HashMap<>();
        }

        if (jobTitle == null) {
            jobTitle = new HashMap<>();
        }
        if (qualification == null) {

            qualification = new HashMap<>();
        }
        if (companyScale==null) {
            companyScale = new HashMap<>();
        }
        if (province == null) {
            province = new HashMap<>();
        }
        if (rank == null) {
            rank = new HashMap<>();
        }
    }
    public void formdomain () {
        domainDirect = new String[4][4];
        int k = 0, j = 0;
        for (int i = 0; i < tempdomainDirect.length; i++) {
            domainDirect[k][j++] = tempdomainDirect[i];
            if (j == 4) {
                k++;
                j = 0;
            }
        }
    }
    public String getKeyAndOr () {
        return keyAndOr;
    }

    public void setKeyAndOr (String keyAndOr) {
        this.keyAndOr = keyAndOr;
    }

    public String getAvoidKey () {
        return avoidKey;
    }

    public void setAvoidKey (String avoidKey) {
        this.avoidKey = avoidKey;
    }

    public Map<String, String> getCompanyScale () {
        return companyScale;
    }

    public void setCompanyScale (Map<String, String> companyScale) {
        this.companyScale = companyScale;
    }

    public String getFuzzyKey () {
        return fuzzyKey;
    }

    public void setFuzzyKey (String fuzzyKey) {
        this.fuzzyKey = fuzzyKey;
    }

    public String getKey () {
        return key;
    }

    public void setKey (String key) {
        this.key = key;
    }

    public Map<String, String> getWorkType () {
        return workType;
    }

    public String[] getTempdomainDirect () {
        return tempdomainDirect;
    }

    @Override
    public String toString () {
        StringBuilder stringBuilder = new StringBuilder();
        if (domainDirect == null) {
            domainDirect = new String[4][4];
        }
        for (String[] strings : domainDirect) {
            stringBuilder.append(Arrays.toString(strings));
        }
        return "Expert{" +
                "workType=" + workType +
                ", jobTitle=" + jobTitle +

                ", qualification=" + qualification +
                ", companyScale=" + companyScale +
                ", province=" + province +
                ", rank=" + rank +
                ", scienCon=" + scienCon +
                ", judExper=" + judExper +
                ", other=" + other +
                ", originLabel='" + originLabel + '\'' +
                ", andOrDomain='" + andOrDomain + '\'' +
                ", fuzzyKey='" + fuzzyKey + '\'' +
                ", key='" + key + '\'' +
                ", avoidKey='" + avoidKey + '\'' +
                ", domainDirect=" + stringBuilder.toString() +
                ", tempdomainDirect=" + Arrays.toString(tempdomainDirect) +
                ", experNum=" + experNum +
                ", keyandor=" + keyAndOr +
                '}';
    }



    public void setWorkType (Map<String, String> workType) {
        this.workType = workType;
    }

    public Map<String, String> getJobTitle () {
        return jobTitle;
    }

    public void setJobTitle (Map<String, String> jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Map<String, String> getQualification () {
        return qualification;
    }

    public void setQualification (Map<String, String> qualification) {
        this.qualification = qualification;
    }

    public Map<String, String> getCompanyScalee () {
        return companyScale;
    }

    public void setCompanyScalee (Map<String, String> companyScalee) {
        this.companyScale = companyScalee;
    }

    public Map<String, String> getProvince () {
        return province;
    }

    public void setProvince (Map<String, String> province) {
        this.province = province;
    }

    public Map<String, String> getRank () {
        return rank;
    }

    public void setRank (Map<String, String> rank) {
        this.rank = rank;
    }

    public boolean isScienCon () {
        return scienCon;
    }

    public void setScienCon (boolean scienCon) {
        this.scienCon = scienCon;
    }

    public boolean isJudExper () {
        return judExper;
    }

    public void setJudExper (boolean judExper) {
        this.judExper = judExper;
    }

    public boolean isOther () {
        return other;
    }

    public void setOther (boolean other) {
        this.other = other;
    }

    public String getOriginLabel () {
        return originLabel;
    }

    public void setOriginLabel (String originLabel) {
        this.originLabel = originLabel;
    }

    public String getAndOrDomain () {
        return andOrDomain;
    }

    public void setAndOrDomain (String andOrDomain) {
        this.andOrDomain = andOrDomain;
    }

    public String[][] getDomainDirect () {
        return domainDirect;
    }

    public void setDomainDirect (String[][] domainDirect) {
        this.domainDirect = domainDirect;
    }

    public int getExperNum () {
        return experNum;
    }

    public void setExperNum (int experNum) {
        this.experNum = experNum;
    }



}
