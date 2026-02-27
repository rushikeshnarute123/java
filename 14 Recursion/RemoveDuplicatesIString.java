public class RemoveDuplicatesIString {
    public static void RemoveDuplicates(String str, int idx, StringBuilder sb, boolean map[]){
        if(idx == str.length()){
            System.out.println(sb);
            return;
        }

        char currChar = str.charAt(idx);
        if(map[currChar-'a'] == true){
            RemoveDuplicates(str, idx+1, sb, map);
        }else{
            map[currChar-'a'] = true;
            RemoveDuplicates(str, idx+1, sb.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        String str = "apnacollege";
        RemoveDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
