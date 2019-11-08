package boshzamanlar;

public class fun {
    public static void main(String[] arg){
        char branch ='C';
        int collegeYear = 4;
        switch (collegeYear){
            case 1:
                System.out.println("English, Maths, Science");
                break;
            case 2:
                switch (branch){
                    case 'C':
                        System.out.println("operating");
                        break;
                    case 'E':
                        System.out.println("micro");
                        break;
                    case 'M':
                        System.out.println("drawing");
                        break;
                }
                break;
            case 3:
                switch (branch){
                    case 'C':
                        System.out.println("computer");
                        break;
                    case 'E':
                        System.out.println("fundamentals");
                        break;
                    case 'M':
                        System.out.println("internal");
                        break;
                }
                break;
            case 4:
                switch (branch){
                    case 'C':
                        System.out.println("data networks");
                        break;
                    case 'E':
                        System.out.println("image");
                        break;
                    case 'M':
                        System.out.println("thermal");
                        break;
                }
                break;
        }
    }
}
