package StarWarsProject;

import java.util.Scanner; 
public class MainMethod
{
   public static void main (String [] args){
        Scanner kb = new Scanner(System.in);//Taking in user data
        boolean redoFirst = true;//boolean to redo prompt if needed
        boolean redoSecond = true;//boolean to redo prompt if needed
    	Planet[] planet = new Planet[14];//Create an array to store planets
    	Graph distances = new Graph(14); //Creating Graph
    	//variables to determine distance 
        double xi;       //x1
        double xii;      //x2
        double yi;       //y1
        double yii;      //y2
        double distance; // distance between 2 planets
        //variables used to determine and print the edge
        int startIndex = -1; //starting planet index
        int endIndex = -1;   //ending planet index
        int counter = 0;     //counter so that the distance is only printed 1 time
    	//creating planets and storing names
        Planet Naboo = new Planet("Naboo","Mid Rim", 334.442, -707.231);
        planet[0]=Naboo; //Store planets into planet array
        
        Planet Kashyyyk = new Planet("Kashyyk","Mid Rim", 472.517, 11.164);
        planet[1]=Kashyyyk;
        
        Planet Alderaan = new Planet("Alderaan","Core", 129.496, -5.968);
        planet[2]=Alderaan;
        
        Planet Geonosis = new Planet("Geonosis","Outer Rim", 644.96, -673.297);
        planet[3]=Geonosis;
        
        Planet Kamino = new Planet("Kamino","Outer Rim", 710.488, -530.778);
        planet[4]=Kamino;
        
        Planet Dagobah = new Planet("Dagobah","Outer Rim", 164.058, -951.168);
        planet[5]=Dagobah;
        
        Planet Hoth = new Planet("Hoth","Outer Rim", -94.755, -858.69);
        planet[6]=Hoth;
        
        Planet Bespin = new Planet("Bespin","Outer Rim", -95.33, -849.857);
        planet[7]=Bespin;
        
        Planet Mustafar = new Planet("Mustafar","Outer Rim", 17.856, -984.675);
        planet[8]=Mustafar;
        
        Planet Coruscant = new Planet("Coruscant","Core", 0, 0);
        planet[9]=Coruscant;
        
        Planet Tatooine = new Planet("Tatooine","Outer Rim", 644.386, -673.274);
        planet[10]=Tatooine;
        
        Planet Mandalore = new Planet("Mandlore","Outer Rim", 363.452, 272.211);
        planet[11]=Mandalore;
        
        Planet OrdMantell = new Planet("Ord Mantell","Mid Rim", 4.742, 254.964);
        planet[12]=OrdMantell;
        
        Planet Dathomir = new Planet("Dathomir","Outer Rim", 314.44, 362.44);
        planet[13]=Dathomir;
        
        //creating the graph
        for (int i = 0; i <14; i++){
            xi = planet[i].getX();
            yi = planet[i].getY();
            for (int j = 0; j < 14; j++){
                xii = planet[j].getX();
                yii = planet[j].getY();
                distance = Math.sqrt(((yii - yi)*(yii - yi)) + (xii - xi)*(xii - xi)); //distance formula
                distances.addEdge(i, j, distance); //adding edge to matrix
            }
        }
        //distances.displayGraph(); - checked to see if our graph is correct
        
        //User Side
        System.out.println("Welcome to the ships navigation system.");
        System.out.println();
        for(int i = 0; i <planet.length;i++) 
            System.out.println(planet[i].getName());//print planet names
        System.out.println();
        
        //STARTING PLANET CODE
        System.out.print("Please enter your starting planet: ");//prompt
        String startingPoint = kb.nextLine().trim();//Save starting planet name into a string
        //Makes sure input is valid
        for(int i = 0; i < planet.length;i++)
        if(startingPoint.equals(planet[i].getName())) {
    	   redoFirst = false;
        }
        if(redoFirst){
           System.out.println("I don't recognize that planet, could you re-enter your starting planet?");
           startingPoint = kb.nextLine().trim();
        }

        //ENDING PLANET CODE
        System.out.print("Please enter your desired destination: "); //prompt
        String endingPoint = kb.nextLine().trim(); //save destination into a string 
        //Makes sure input is valid
        for(int i = 0; i < planet.length;i++)
        if(endingPoint.equals(planet[i].getName())) {
    	   redoSecond = false;
        }
        if(redoSecond){
           System.out.println("I dont recognize that planet, could you re-enter your Ending planet?");
           endingPoint = kb.nextLine().trim();
        }

        //DISTANCE CODE 
        for(int i = 0; i <planet.length;i++){ 
           if(startingPoint.compareTo( planet[i].getName()) == 0)
            startIndex = i;
           if ((endingPoint.compareTo( planet[i].getName()) == 0))
            endIndex = i; 
           if (startIndex != -1 && endIndex != -1 && counter == 0){
            distances.displayEdge(startIndex, endIndex);
            counter ++;
           }     
        }    
   }
}
