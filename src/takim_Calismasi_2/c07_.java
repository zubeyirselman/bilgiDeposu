package takim_Calismasi_2;

public class c07_ {
    public static void main(String[] args) {


        String str = "accessories";
        String d = "";
        for(Integer i=0; i<str.length(); i++){
            String c = str.substring(i,i+1);
            if(str.indexOf(c)!=str.lastIndexOf(c)){
                if(!d.contains(c)){
                    d = d + c;
                }
            }
        }
        System.out.println(d);
    }
}
