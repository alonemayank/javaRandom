/**
 * Created by apurvatripathi on 2/5/19.
 */
public class CDinDir {

    public static void main(String[] args) {
        //creating  dir structure
        Directory one = new Directory("1");
        Directory two = new Directory("2");
        Directory three = new Directory("3");
        Directory four = new Directory("4");
        Directory five = new Directory("5");
        Directory six = new Directory("6");
        Directory seven = new Directory("7");
        Directory eight = new Directory("8");

        one.addDirectory(two);
        one.addDirectory(three);
        one.addDirectory(four);
        two.addDirectory(five);
        two.addDirectory(six);
        five.addDirectory(seven);
        four.addDirectory(eight);

        two.parent = one;
        three.parent = one;
        four.parent = one;
        five.parent = two;
        six.parent = two;
        seven.parent = five;
        eight.parent=four;

        String a = "haha";
        switch (a){
            case"haha":
                System.out.println("MADARCHOOOD");
            case"lol":
                System.out.println("haha");
        }
        System.out.println(implemntCD("../../10",six).directoryName);
        System.out.println(String.format("id: %08.2f", 423.147));





    }

    public static Directory implemntCD(String path, Directory current){
        Directory cur=current;
        String[] paths = path.split("/");
        for(String p:paths){
            if(p.equals("..")){
                cur = cur.parent;
            }else{
                boolean flag = false;
                for(Directory d:cur.subdirectories){
                    if(d.directoryName.equals(p)){
                        cur = d;
                        flag=true;
                        break;
                    }
                }
                if(!flag){
                    System.out.println("Incorrect path supplied");
                    return current;
                }
            }
        }
        return cur;
    }
}
