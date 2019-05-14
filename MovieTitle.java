import java.io.File;
import java.util.Scanner;

public class MovieTitle {
    public static void main(String[] args) throws Exception {

        File text = new File("MovieTitles.txt");
        Scanner words = new Scanner(text);

        int contorLinie = 0;
        while (words.hasNextLine()) {
            words.nextLine();
            contorLinie++;
        }
        int randomNr = (int) (Math.random() * contorLinie) + 1;
      //  System.out.println("Random number: " + randomNr);

        int contorVer = 0, length = 0, contor = 0,l=0,index=0;
        char baraJos = '_';
        String t,movie=null;

        for (int i = 0; i < contorLinie; i++) {
            if (randomNr == i) {
                File a = new File("MovieTitles.txt");
                Scanner s = new Scanner(a);

                do {
                    t = s.nextLine();
                    contorVer++;
                    if (contorVer == (i)) {
                        length = t.length();
                        movie=t;
                     //   System.out.println("Random titlee: " + t);
                        System.out.println("length: " + length);
                    }
                }
                while (s.hasNextLine());
            }
        }
        System.out.print("The name of the movie biatch?:");

        for (int j = 0; j < length; j++) {
            System.out.print(" " + baraJos );
        }
        System.out.println();
      //  System.out.print("vector:");

       char [] vector=new char[length];
        for (int j = 0; j < length; j++) {
        vector[j]='_';
         //  System.out.print(" " +vector[j]);

        }
        System.out.println();
        System.out.println("Type your letter and press enter:");

            while(index < length){
                Scanner imput = new Scanner(System.in);
                char letter = imput.next().charAt(0);

                l=movie.indexOf(letter);

                while(l!=-1)
                {
                    vector[l]=letter;
                    index++;
                    int value=l;
                    l=movie.indexOf(letter,value+1);
                }
                for (int j = 0; j < length; j++) {
                    System.out.print(" " +vector[j]);
                }
                   System.out.println();
            }
    }
}

