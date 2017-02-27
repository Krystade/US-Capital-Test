//Jack Schmid
import javax.swing.*;
public class Capital{
    public static void main (String[] args){
        String[][] states = new String[][]{
        {"Alabama", "Birmingham", "Montgomery", "Mobile", "Huntsville", "Tuscaloosa", "Hoover"},

        {"Alaska", "Anchorage", "Fairbanks", "Juneau", "Sitka", "Ketchikan", "Wasilla"},
        
        {"Arizona", "Phoenix", "Tucson", "Mesa", "Chandler", "Glendale", "Scottsdale"},
        
        {"Arkansas", "Little Rock", "Fort Smith", "Fayetteville", "Springdale", "Jonesboro", "North Little Rock"},
        
        {"California", "Los Angeles", "San Diego", "San Jose", "San Francisco", "Fresno", "Sacramento"},
        
        {"Colorado", "Denver", "Colorado Springs", "Aurora", "Fort Collins", "Lakewood", "Thornton"},
        
        {"Connecticut", "Bridgeport", "New Haven", "Hartford", "Stamford", "Waterbury", "Norwalk"},
        
        {"Delaware", "Wilmington", "Dover", "Newark", "Middletown", "Smyrna", "Milford"},
        
        {"Florida", "Jacksonville", "Miami", "Tampa", "St Petersburg", "Orlando", "Hialeah"},
        
        {"Georgia", "Atlanta", "Augusta", "Columbus", "Savannah", "Athens", "Sandy Springs"},
        
        {"Hawaii", "Honolulu", "Pearl City", "Hilo", "Kailua", "Waipahu", "Kane'ohe"},
        
        {"Idaho", "Boise", "Nampa", "Meridian", "Idaho Falls", "Pocatello", "Caldwell"},
        
        {"Illinois", "Chicago", "Aurora", "Rockford", "Joliet", "Naperville", "Springfield"},
        
        {"Indiana", "Indianapolis", "Fort Wayne", "Evansville", "South Bend", "Hammond", "Bloomington"},
        
        {"Iowa", "Des Moines", "Cedar Rapids", "Davenport", "Sioux City", "Waterloo", "Iowa City"},
        
        {"Kansas", "Wichita", "Overland Park", "Kansas City", "Topeka", "Olathe", "Lawrence"},
        
        {"Kentucky", "Louisville", "Lexington-Fayette", "Bowling Green", "Owensboro", "Covington", "Hopkinsville"},
        
        {"Louisiana", "New Orleans", "Baton Rouge", "Shreveport", "Lafayette", "Lake Charles", "Kenner"},
        
        {"Maine", "Portland", "Lewiston", "Bangor", "South Portland", "Auburn", "Biddeford"},
        
        {"Maryland", "Baltimore", "Frederick", "Rockville", "Gaithersburg", "Bowie", "Hagerstown"},
        
        {"Massachusetts", "Boston", "Worcester", "Springfield", "Lowell", "Cambridge", "New Bedford"},
        
        {"Michigan", "Detroit", "Grand Rapids", "Warren", "Sterling Heights", "Lansing", "Ann Arbor"},
        
        {"Minnesota", "Minneapolis", "Saint Paul", "Rochester", "Duluth", "Bloomington", "Brooklyn Park"},
        
        {"Mississippi", "Jackson", "Gulfport", "Southaven", "Hattiesburg", "Biloxi", "Meridian"},
        
        {"Missouri", "Kansas City", "Saint Louis", "Springfield", "Independence", "Columbia", "Lee's Summit"},
        
        {"Montana", "Billings", "Missoula", "Great Falls", "Bozeman", "Butte-Silver Bow", "Helena"},
        
        {"Nebraska", "Omaha", "Lincoln", "Bellevue", "Grand Island", "Kearney", "Fremont"},
        
        {"Nevada", "Las Vegas", "Henderson", "Reno", "North Las Vegas", "Sparks", "Carson City"},
        
        {"New Hampshire", "Manchester", "Nashua", "Concord", "Dover", "Rochester", "Keene"},
        
        {"New Jersey", "Newark", "Jersey City", "Paterson", "Elizabeth", "Trenton", "Clifton"},
        
        {"New Mexico", "Albuquerque", "Las Cruces", "Rio Rancho", "Santa Fe", "Roswell", "Farmington"},
        
        {"New York", "New York", "Buffalo", "Rochester", "Yonkers", "Syracuse", "Albany"},
        
        {"North Carolina", "Charlotte", "Raleigh", "Greensboro", "Winston-Salem", "Durham", "Fayetteville"},
        
        {"North Dakota", "Fargo", "Bismarck", "Grand Forks", "Minot", "West Fargo", "Mandan"},
        
        {"Ohio", "Columbus", "Cleveland", "Cincinnati", "Toledo", "Akron", "Dayton"},
        
        {"Oklahoma", "Oklahoma City", "Tulsa", "Norman", "Broken Arrow", "Lawton", "Edmond"},
        
        {"Oregon", "Portland", "Eugene", "Salem", "Gresham", "Hillsboro", "Beaverton"},
        
        {"Pennsylvania", "Philadelphia", "Pittsburgh", "Allentown", "Erie", "Reading", "Scranton"},
        
        {"Rhode Island", "Providence", "Warwick", "Cranston", "Pawtucket", "East Providence", "Woonsocket"},
        
        {"South Carolina", "Columbia", "Charleston", "North Charleston", "Mount Pleasant", "Rock Hill", "Greenville"},
        
        {"South Dakota", "Sioux Falls", "Rapid City", "Aberdeen", "Brookings", "Watertown", "Mitchell"},
        
        {"Tennessee", "Memphis", "Nashville", "Knoxville", "Chattanooga", "Clarksville", "Murfreesboro"},
        
        {"Texas", "Houston", "San Antonio", "Dallas", "Austin", "Fort Worth", "El Paso"},
        
        {"Utah", "Salt Lake City", "West Valley City", "Provo", "West Jordan", "Orem", "Sandy"},
        
        {"Vermont", "Burlington", "South Burlington", "Rutland", "Essex Junction", "Barre", "Montpelier"},
        
        {"Virginia", "Virginia Beach", "Norfolk", "Chesapeake", "Richmond", "Newport News", "Alexandria"},
        
        {"Washington", "Seattle", "Spokane", "Tacoma", "Vancouver", "Bellevue", "Kent"},
        
        {"West Virginia", "Charleston", "Huntington", "Parkersburg", "Morgantown", "Wheeling", "Weirton"},
        
        {"Wisconsin", "Milwaukee", "Madison", "Green Bay", "Kenosha", "Racine", "Appleton"},
        
        {"Wyoming", "Cheyenne", "Casper", "Laramie", "Gillette", "Rock Springs", "Sheridan"}
        };
        String[] caps = new String[50];
        caps[0] = "Montgomery";
        caps[1] = "Juneau";
        caps[2] = "Phoenix";
        caps[3] = "LittleRock";
        caps[4] = "Sacramento";
        caps[5] = "Denver";
        caps[6] = "Hartford";
        caps[7] = "Dover";
        caps[8] = "Tallahassee";
        caps[9] = "Atlanta";
        caps[10] = "Honolulu";
        caps[11] = "Boise";
        caps[12] = "Springfield";
        caps[13] = "Indianapolis";
        caps[14] = "DesMoines";
        caps[15] = "Topeka";
        caps[16] = "Frankfort";
        caps[17] = "BatonRouge";
        caps[18] = "Augusta";
        caps[19] = "Annapolis";
        caps[20] = "Boston";
        caps[21] = "Lansing";
        caps[22] = "StPaul";
        caps[23] = "Jackson";
        caps[24] = "JeffersonCity";
        caps[25] = "Helena";
        caps[26] = "Lincoln";
        caps[27] = "CarsonCity";
        caps[28] = "Concord";
        caps[29] = "Trenton";
        caps[30] = "SantaFe";
        caps[31] = "Albany";
        caps[32] = "Raleigh";
        caps[33] = "Bismarck";
        caps[34] = "Columbus";
        caps[35] = "OklahomaCity";
        caps[36] = "Salem";
        caps[37] = "Harrisburg";
        caps[38] = "Providence";
        caps[39] = "Columbia";
        caps[40] = "Pierre";
        caps[41] = "Nashville";
        caps[42] = "Austin";
        caps[43] = "SaltLakeCity";
        caps[44] = "Montpelier";
        caps[45] = "Richmond";
        caps[46] = "Olympia";
        caps[47] = "Charleston";
        caps[48] = "Madison";
        caps[49] = "Cheyenne";
        int score = 0;
        for(int i = 0; i < 50; i++){
            if(states[i][0].length() <= 7){
                System.out.print(states[i][0] + "\t\t" + states[i][1] + "\n");
            }else{
                System.out.print(states[i][0] + "\t" + states[i][1] + "\n");
            }
        }
        boolean done = false;
        boolean contains = true;
        while (done != true){
            int answer = (int)(Math.random() * 50);
            String[] mc = {states[answer][1], states[answer][1],states[answer][1],states[answer][1]};
            int rand = (int)(Math.random() * 4);
            for (String value : mc){
                System.out.println(value);
            }
            String temp = mc[0];
            temp = mc[rand];
            mc[rand] = mc[0];
            mc[0] = temp;
            
            Object[] options = {mc[0],
                                mc[1],
                                mc[2],
                                mc[3]};
            int n = JOptionPane.showOptionDialog(null,
                "Capital of " + states[answer][0],
                "States and Capitals",
                JOptionPane.INFORMATION_MESSAGE,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);
                
            String guess = mc[n];
                
            if((guess.toLowerCase()).equals((states[answer][1]).toLowerCase())){                    
                JOptionPane.showMessageDialog(null,"Correct! " + states[answer][1] + " is the capital of " + states[answer][0]);
                score += 2;
            }else{
                JOptionPane.showMessageDialog(null,guess + " is not the captal of " + states[answer][0] + "\nThe answer was " + states[answer][1]);
                score--;
            }
            int x = JOptionPane.showConfirmDialog(null, "Continue?\nScore: " + score);
            if(x != 0){
                done = true;
            }
            }
        /*while (done != true){
            int answer = (int)(Math.random() * 50);
            String guess = JOptionPane.showInputDialog("What is the capital of " + (states[answer][0]) + 
            "\nNot Case Sensitive");
            if((guess.toLowerCase()).equals((states[answer][1]).toLowerCase())){                    
                JOptionPane.showMessageDialog(null,"Correct! " + states[answer][1] + " is the capital of " + states[answer][0]);
                score += 2;
            }else{
                JOptionPane.showMessageDialog(null,guess + " is not the captal of " + states[answer][0] + "\nThe answer was " + states[answer][1]);
                score--;
            }
            int x = JOptionPane.showConfirmDialog(null, "Continue?\nScore: " + score);
            if(x != 0){
                done = true;
            }
        }*/
    }
}
