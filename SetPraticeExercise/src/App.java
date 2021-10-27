import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Profile;

public class App {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Ente file full path: ");
        String path = sc.nextLine();

        try (BufferedReader bf = new BufferedReader(new FileReader(path))) {

            
            Set<Profile> set = new HashSet<>();

            String line = bf.readLine();
            while(line != null){
                
                String[] fields = line.split(" ");
                String username = fields[0];
                Date moment = Date.from(Instant.parse(fields[1]));

                set.add(new Profile(username, moment));

                line = bf.readLine();
            }

            System.out.println("Total users: " + set.size());
        

        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();

    }

}
