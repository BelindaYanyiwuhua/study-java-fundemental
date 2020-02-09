package cn.itcast.demo03;

public class FindStr {
    public Object[] deleteSubString(String str1, String str2){
        StringBuffer stringBuffer = new StringBuffer(str1);
        int delCount = 0;
        Object[] obj = new Object[2];

        while(true){
            int index = stringBuffer.indexOf(str2);
            if (index == -1){
                break;
            }
            stringBuffer.delete(index,index+str2.length());
            delCount++;
        }
        if (delCount!=0){
            obj[0] = stringBuffer.toString();
            obj[1] = delCount;
        }else {
            obj[0] = -1;
            obj[1] = -1;
        }
        return obj;
    }

    public static void main(String[] args) {
        String str1 = "QNQQNN";
        String str2 = "NQ";
        String result = str1;
        while (result.contains(str2)){
            result = result.replace(str2,"");
        }
        System.out.println(result.length());

    }
}
