import java.util.Scanner;
public class LevelQuestions
{
  //we insert all the questions of all of the levels in this file
  //THIS IS THE FINAL DRIVER, Only 
  public static void main(String [] args)
  {

    
    /*
                                root 
                 2                                3
         4                5                 6                    7
      8       9        10     11         12       13        14       15
    16  17  18  19  20  21  22  23    24  25    26  27    28  29    30  31

    */

        
    Scanner read = new Scanner(System.in);
    
    Tree [] arr = new Tree[5];
    Tree lev1 = new Tree();
    Tree lev2 = new Tree();
    Tree lev3 = new Tree();
    Tree lev4 = new Tree();
    Tree lev5 = new Tree();
    
    arr[0] = lev1;
    arr[1] = lev2;
    arr[2] = lev3;
    arr[3] = lev4;
    arr[4] = lev5;
/*
         LEVEL ONE
*/ 

    Node LevelOne31 = new Node("Seoul is the capital of North Korea.", false, 4, null,null);
    Node LevelOne30 = new Node("Asia is the largest continent in the world.", true, 0, null,null);
    Node LevelOne29 = new Node("The five rings on the Olympic flag are interlocking", true,1,null,null);
    Node LevelOne28 = new Node("Mexico is south of the United States", true,0,null,null );
    Node LevelOne27 = new Node("Fish cannot blink", true, 2, null,null);
    Node LevelOne26 = new Node("Sacramento is the capital of California", true, 0, null, null);
    Node LevelOne25 = new Node("Niagra Falls is the biggest geyser in North America", false, 1, null, null);
    Node LevelOne24 = new Node("Japan's flag has two colors", true, 0, null, null);
    Node LevelOne23 = new Node("Antartica has the third highest population of cattle in the world", false, 3, null, null);
    Node LevelOne22 = new Node("Rhode Island is the smallest state in the US", true, 0, null, null);
    Node LevelOne21 = new Node("White starts first in chess", true, 1, null, null);
    Node LevelOne20 = new Node("Checkers pieces are called pawns", false, 0, null, null);
    Node LevelOne19 = new Node("There are 48 contiguous states in the US", true, 2, null, null);
    Node LevelOne18 = new Node("There are seven continents on Earth", true, 0, null, null);
    Node LevelOne17 = new Node("Thor was the son of the God, Odin", true, 1, null, null);
    Node LevelOne16 = new Node("Apples are a fruit", true, 0, null, null);
    Node LevelOne15 = new Node("Fruits typically have seeds", true, 3, LevelOne30, LevelOne31);
    Node LevelOne14 = new Node("French fries came from France", false, 0, LevelOne28, LevelOne29);
    Node LevelOne13 = new Node("Male seahorses give birth", true, 1, LevelOne26, LevelOne27);
    Node LevelOne12 = new Node("Barack Obama was the 33rd US president", false, 0, LevelOne24, LevelOne25);
    Node LevelOne11 = new Node("Mitochondria is the powerhouse of the cell", true, 2, LevelOne22, LevelOne23);
    Node LevelOne10 = new Node("Canada is South of the United States", false, 0, LevelOne20, LevelOne21);
    Node LevelOne9 = new Node("Shakespeare wrote plays", true, 1, LevelOne18, LevelOne19);
    Node LevelOne8 = new Node("Soccer is played in the Olympics", true, 0, LevelOne16, LevelOne17);
    Node LevelOne7 = new Node("Hockey finals in America is the Super Bowl", false, 2, LevelOne14, LevelOne15);
    Node LevelOne6 = new Node("Football finals in America is the Super Bowl", true, 0, LevelOne12, LevelOne13);
    Node LevelOne5 = new Node("There are 6 planets in our Solar System", false, 1, LevelOne10, LevelOne11);
    Node LevelOne4 = new Node("Iron Man is a Marvel movie", true, 0, LevelOne8, LevelOne9);
    Node LevelOne3 = new Node("Cats have 4 legs", true, 1, LevelOne6, LevelOne7);
    Node LevelOne2 = new Node ("Penguins have 4 legs", false, 0, LevelOne4, LevelOne5 );
    Node LevelOneRoot = new Node("Dogs have 4 legs", true, 0, LevelOne2, LevelOne3);  
/*
    LEVEL TWO
*/

    Node LevelTwo31 = new Node("Bull snakes are venomous", false, 4, null,null);
    Node LevelTwo30 = new Node("Shakespeare started out as a country singer", true, 0, null,null);
    Node LevelTwo29 = new Node("Harrison Ford plays the character of Hon Solo in Solo: A Star Wars story", false,1,null,null);
    Node LevelTwo28 = new Node("Pencil lead is made from lead", false,0,null,null );
    Node LevelTwo27 = new Node("Pong is the world's first video game", true, 2, null,null);
    Node LevelTwo26 = new Node("Calculus was invented by Isaac Newton", true, 0, null, null);
    Node LevelTwo25 = new Node("The cytoplasm is responsible for cellular respiration", false, 1, null, null);
    Node LevelTwo24 = new Node("Woodbridge is the biggest campus in IUSD", false, 0, null, null);
    Node LevelTwo23 = new Node("The Arabian Desert is the largest desert in the world", false, 3, null, null);
    Node LevelTwo22 = new Node("Avatar is an anime", false, 0, null, null);
    Node LevelTwo21 = new Node("Windows is the most widely used operating system", true, 1, null, null);
    Node LevelTwo20 = new Node("Ikea sells cars", false, 0, null, null);
    Node LevelTwo19 = new Node("The planets are all named after Greek Gods", false, 2, null, null);
    Node LevelTwo18 = new Node("The color black has the lowest albedo", true, 0, null, null);
    Node LevelTwo17 = new Node("Jennifer Aniston and Brad Pitt announced their separation as a couple in 2005", true, 1, null, null);
    Node LevelTwo16 = new Node("Basketball is played on a court", true, 0, null, null);
    Node LevelTwo15 = new Node("Great White Sharks are mostly white", false, 3, LevelTwo30, LevelTwo31);
    Node LevelTwo14 = new Node("There are 23 films in the MCU up until phase 3", true, 0, LevelTwo28, LevelTwo29);
    Node LevelTwo13 = new Node("Checker pieces can move vertically", false, 1, LevelTwo26, LevelTwo27);
    Node LevelTwo12 = new Node("Macroevolution is the process of many microevolutions occurring over a long period of time", true, 0, LevelTwo24, LevelTwo25);
    Node LevelTwo11 = new Node("The Amazon is the longest river in the world", false, 2, LevelTwo22, LevelTwo23);
    Node LevelTwo10 = new Node("Bing is the most widely used search engine", false, 0, LevelTwo20, LevelTwo21);
    Node LevelTwo9 = new Node("SpaceX is the first private space company", false, 1, LevelTwo18, LevelTwo19);
    Node LevelTwo8 = new Node("Dwayne Johnson is the celebrity known as the 'Rock' ", true, 0, LevelTwo16, LevelTwo17);
    Node LevelTwo7 = new Node("Guinea Pigs are related to pigs", false, 2, LevelTwo14, LevelTwo15);
    Node LevelTwo6 = new Node("The knight is the only piece in chess which can only move diagonally", false, 0, LevelTwo12, LevelTwo13);
    Node LevelTwo5 = new Node("The Sahara Desert is located in Africa", true, 1, LevelTwo10, LevelTwo11);
    Node LevelTwo4 = new Node("The Soviets had their own space shuttle", true, 0, LevelTwo8, LevelTwo9);
    Node LevelTwo3 = new Node("Pufferfish are still poisonous even when cooked", true, 1, LevelTwo6, LevelTwo7);
    Node LevelTwo2 = new Node ("Texas is the largest state in America", false, 0, LevelTwo4, LevelTwo5 );
    Node LevelTwoRoot = new Node("Sea horses have no teeth or stomach", true, 0, LevelTwo2, LevelTwo3);  
    
    //LEVEL 3
    
    
    Node LevelThree31 = new Node("Arseus is a default dragon type.", false, 4, null,null);
    Node LevelThree30 = new Node("The first law of robotics prohibits robots from harming humans", true, 0, null,null);
    Node LevelThree29 = new Node("Blood type O negative is considered a universal donor", true,1,null,null);
    Node LevelThree28 = new Node("A supernova is an effect of a black hole", false,0,null,null );
    Node LevelThree27 = new Node("The Babylonians invented the square root", true, 2, null,null);
    Node LevelThree26 = new Node("Beowulf is often referred to as the first important piece of literature in English", true, 0, null, null);
    Node LevelThree25 = new Node("Prosciutto comes from dry-cured ham", true, 1, null, null);
    Node LevelThree24 = new Node("The Bible is American's second highest-rated book", false, 0, null, null);
    Node LevelThree23 = new Node("The anime Jujutsu Kaisen uses the power system of cursed energy and cursed techniques", true, 3, null, null);
    Node LevelThree22 = new Node("Samuel L. Jackson is the highest grossing actor of all time", true, 0, null, null);
    Node LevelThree21 = new Node("The first automatic weapon was created in 1896", false, 1, null, null);
    Node LevelThree20 = new Node("Joe Ingles plays for the Golden State Warriors", false, 0, null, null);
    Node LevelThree19 = new Node("Melanie Janine Brown was the first Spice Girl to get married", true, 2, null, null);
    Node LevelThree18 = new Node("Erythrophobia is the abnormal fear of hugging", true, 0, null, null);
    Node LevelThree17 = new Node("Lorde's debut song was 'Royals' in 2013", true, 1, null, null);
    Node LevelThree16 = new Node("Mao Zedong killed more people than Adolf Hitler and Joseph Stalin", true, 0, null, null);
    Node LevelThree15 = new Node("Metal Mario is a heavy character in Mario Kart 8 Deluxe", true, 3, LevelThree30, LevelThree31);
    Node LevelThree14 = new Node("Blood cells are typically shaped like pears", false, 0, LevelThree28, LevelThree29);
    Node LevelThree13 = new Node("Statistics has been dated to have been around since the 1400s", false, 1, LevelThree26, LevelThree27);
    Node LevelThree12 = new Node("Gelato is a type of ice cream", false, 0, LevelThree24, LevelThree25);
    Node LevelThree11 = new Node("The protagonist of the anime Re:Zero respawns after dying", true, 2, LevelThree22, LevelThree23);
    Node LevelThree10 = new Node("The first computer was invented in the 1910s", false, 0, LevelThree20, LevelThree21);
    Node LevelThree9 = new Node("The birth name of Oprah Winfrey is actually 'Oprarah'", false, 1, LevelThree18, LevelThree19);
    Node LevelThree8 = new Node("Bach was a classical composer", false, 0, LevelThree16, LevelThree17);
    Node LevelThree7 = new Node("Squirtle was the first pokemon created", false, 2, LevelThree14, LevelThree15);
    Node LevelThree6 = new Node("Zero is a natural number", false, 0, LevelThree12, LevelThree13);
    Node LevelThree5 = new Node("Beyblade is an anime about spinning tops", true, 1, LevelThree10, LevelThree11);
    Node LevelThree4 = new Node("Rob Kardashian is the youngest Kardashian", true, 0, LevelThree8, LevelThree9);
    Node LevelThree3 = new Node("Mario and Luigi are two popular french video game characters", false, 1, LevelThree6, LevelThree7);
    Node LevelThree2 = new Node ("The anime One Piece has over 900 episodes", true, 0, LevelThree4, LevelThree5 );
    Node LevelThreeRoot = new Node("Minecraft is the best selling game of all time", true, 0, LevelThree2, LevelThree3);  
    

    //LEVEL 4
    Node LevelFour31 = new Node("The first free library of Britain opened in the 1850s", true, 4, null,null);
    Node LevelFour30 = new Node("Lamborghini first started out manufacturing tractors.", true, 0, null,null);
    Node LevelFour29 = new Node("The first alarm clock could only ring at 4 am", true,1,null,null);
    Node LevelFour28 = new Node("Tweedledee and Tweedledum are characters in the book Alice in Wonderland", true,0,null,null );
    Node LevelFour27 = new Node("Tweedledee and Tweedledum are characters in the movie Pinocchio", false, 2, null,null);
    Node LevelFour26 = new Node("Shakespeare provides the first recorded use of over 1500 English words", true, 0, null, null);
    Node LevelFour25 = new Node("The third law of robotics ensures that robots obey all commands from humans", false, 1, null, null);
    Node LevelFour24 = new Node("Peanuts are not a nut.", true, 0, null, null);
    Node LevelFour23 = new Node("American football originated in the 1850s", false, 3, null, null);
    Node LevelFour22 = new Node("Paul Revere rode on his horse and said “The British are coming.", false, 0, null, null);
    Node LevelFour21 = new Node("Mars has 3 moons named after Greek gods.", false, 1, null, null);
    Node LevelFour20 = new Node("The second law of robotics necessitates that robots protect their own existence", false, 0, null, null);
    Node LevelFour19 = new Node("Octopus contain 3 hearts", true, 2, null, null);
    Node LevelFour18 = new Node("Metamorphosis for a caterpillar can take anywhere from 1 to 63 days", false, 0, null, null);
    Node LevelFour17 = new Node("The first modern olympics was held in Athens, Greece", true, 1, null, null);
    Node LevelFour16 = new Node("There are over 90 flavors of Fanta.", true, 0, null, null);
    Node LevelFour15 = new Node("Thomas Jefferson and John Adams both died on the Fourth of July.", true, 3, LevelFour30, LevelFour31);
    Node LevelFour14 = new Node("Robinson Crusoe was a character invented by one of Shakespeare’s plays", false, 0, LevelFour28, LevelFour29);
    Node LevelFour13 = new Node("The largest carbon sink in the world is the ocean", true, 1, LevelFour26, LevelFour27);
    Node LevelFour12 = new Node("Jack Sparton is the name of the pirate in the Disney movie", false, 0, LevelFour24, LevelFour25);
    Node LevelFour11 = new Node("Blackbeard was a real English pirate.", true, 2, LevelFour22, LevelFour23);
    Node LevelFour10 = new Node("There have been 44 Super Bowls in modern history", false, 0, LevelFour20, LevelFour21);
    Node LevelFour9 = new Node("The American Civil War was America’s bloodiest conflicts", true, 1, LevelFour18, LevelFour19);
    Node LevelFour8 = new Node("Rocket Arena is Roblox’s oldest game.", true, 0, LevelFour16, LevelFour17);
    Node LevelFour7 = new Node("Typically golf balls have less than 300 dimples", false, 2, LevelFour14, LevelFour15);
    Node LevelFour6 = new Node("Julius Caesar was involved with the queen Cleopatra", true, 0, LevelFour12, LevelFour13);
    Node LevelFour5 = new Node("The highest grossing film is Avengers: Endgame", false, 1, LevelFour10, LevelFour11);
    Node LevelFour4 = new Node("Soccer is considered the king of sports in the world", true, 0, LevelFour8, LevelFour9);
    Node LevelFour3 = new Node("Egyptian Rulers were known as Pharaohs", true, 1, LevelFour6, LevelFour7);
    Node LevelFour2 = new Node ("The 100 years war actually lasted for less than 100 years", false, 0, LevelFour4, LevelFour5 );
    Node LevelFourRoot = new Node("Olympus was the name of the home of the Greek Gods", true, 0, LevelFour2, LevelFour3);  
    
    //Level 5
    Node LevelFive31 = new Node("Bach was a Classical composer.", false, 4, null,null);
    Node LevelFive30 = new Node("Valhalla is the name of the paradise where warriors go after death in Norse Mythology", true, 0, null,null);
    Node LevelFive29 = new Node("Operation Overlord took place on June 9th, 1944", false,1,null,null);
    Node LevelFive28 = new Node("Costantino Roca is a Professional Tennis player", false,0,null,null );
    Node LevelFive27 = new Node("Hephaestus is the messenger of the Gods in Greek Mythology", false, 2, null,null);
    Node LevelFive26 = new Node("The Taj Mahal is located in New Delhi, India", false, 0, null, null);
    Node LevelFive25 = new Node("The wooliest sheep had about 50 pounds of wool worth $300", false, 1, null, null);
    Node LevelFive24 = new Node("The fastest thing in the known universe is light", true, 0, null, null);
    Node LevelFive23 = new Node("Christina Sanchez is the first female bullfighter", true, 3, null, null);
    Node LevelFive22 = new Node("The Femur is the longest and Strongest bone in the human body", true, 0, null, null);
    Node LevelFive21 = new Node("Organs are a structured group of cells with a specific purpose", true, 1, null, null);
    Node LevelFive20 = new Node("L’Hopital came up with L’Hopital’s Rule", false, 0, null, null);
    Node LevelFive19 = new Node("The division symbol is called a skoto after the Greek god of reasoning.", false, 2, null, null);
    Node LevelFive18 = new Node("Nearly 50% of the world’s population is Obese", false, 0, null, null);
    Node LevelFive17 = new Node("If you eat too many carrots, your skin will turn orange.", true, 1, null, null);
    Node LevelFive16 = new Node("Garfield was first published in 1978.", true, 0, null, null);
    Node LevelFive15 = new Node("Walt Disney has won the most Oscar awards as an individual", true, 3, LevelFive30, LevelFive31);
    Node LevelFive14 = new Node("Radishes were the first vegetables planted in space", false, 0, LevelFive28, LevelFive29);
    Node LevelFive13 = new Node("Seahawks won Super Bowl XLVII", false, 1, LevelFive26, LevelFive27);
    Node LevelFive12 = new Node("Rhode Island is south of New Hampshire", false, 0, LevelFive24, LevelFive25);
    Node LevelFive11 = new Node("Ohio is north of West Virginia", true, 2, LevelFive22, LevelFive23);
    Node LevelFive10 = new Node("Deforestation is responsible for significantly less carbon emission than fossil fuels", false, 0, LevelFive20, LevelFive21);
    Node LevelFive9 = new Node("Shakespeare wrote plays", true, 1, LevelFive18, LevelFive19);
    Node LevelFive8 = new Node("Soccer is played in the Olympics", true, 0, LevelFive16, LevelFive17);
    Node LevelFive7 = new Node("Monopoly is a game using fake monopoly cash and only cash", false, 2, LevelFive14, LevelFive15);
    Node LevelFive6 = new Node("Halo was the game that gave “teabagging” widespread popularity.", true, 0, LevelFive12, LevelFive13);
    Node LevelFive5 = new Node("Bowed instruments have origins tracing back to Africa", false, 1, LevelFive10, LevelFive11);
    Node LevelFive4 = new Node("Apple was founded in 1976", true, 0, LevelFive8, LevelFive9);
    Node LevelFive3 = new Node("Peanuts was originally called Li’l Folks", true, 1, LevelFive6, LevelFive7);
    Node LevelFive2 = new Node ("Five soldiers helped raise the US flag over Iwo Jima.", false, 0, LevelFive4, LevelFive5 );
    Node LevelFiveRoot = new Node("Socrates is known as the father of history", false, 0, LevelFive2, LevelFive3);  
    
    
    arr[0].addRoot(LevelOneRoot);
    arr[1].addRoot(LevelTwoRoot);
    arr[2].addRoot(LevelThreeRoot);
    arr[3].addRoot(LevelFourRoot);
    arr[4].addRoot(LevelFiveRoot);

    
    System.out.println("Select a level (1,2,3,4,5) ");
    int levelNum = ( read.nextInt() ) - 1;
    Node current = arr[levelNum].getRoot();
    System.out.println();
    
    System.out.println("You will be given 5 questions. The more questions you get right in a row, the more points you get.");
    System.out.println("The maximum amount of points you can get is 15, and the least you can get is 0.");
    System.out.println();
            
    
    System.out.println(current.getQuestion() );
    System.out.println("Enter a boolean value of either true or false");
    boolean answer1 = read.nextBoolean();
    Node new1 = current;
    if(answer1 == current.getAnswer())
        new1 = current.getRight();
    else
        new1 = current.getLeft();
    arr[levelNum].updateQuestion(current,answer1);
    System.out.println();

    System.out.println(new1.getQuestion() );
    System.out.println("Enter a boolean value of either true or false");
    boolean answer2 = read.nextBoolean();
    Node new2 = new1;
    if(answer2 == new1.getAnswer())
        new2 = new1.getRight();
    else
        new2 = new1.getLeft();
    arr[levelNum].updateQuestion(new1,answer2);
    System.out.println();
    
    System.out.println(new2.getQuestion() );
    System.out.println("Enter a boolean value of either true or false");
    boolean answer3 = read.nextBoolean();
    Node new3 = new2;
    if(answer3 == new2.getAnswer())
        new3 = new2.getRight();
    else
        new3 = new2.getLeft();
    arr[levelNum].updateQuestion(new2,answer3);
    System.out.println();

    System.out.println(new3.getQuestion() );
    System.out.println("Enter a boolean value of either true or false");
    boolean answer4 = read.nextBoolean();
    Node new4 = new3;
    if(answer4 == new3.getAnswer())
        new4 = new3.getRight();
    else
        new4 = new3.getLeft();
    arr[levelNum].updateQuestion(new3,answer4);
    System.out.println();

    System.out.println(new4.getQuestion() );
    System.out.println("Enter a boolean value of either true or false");
    boolean answer5 = read.nextBoolean();
    Node new5 = new4;
    if(answer5 == new4.getAnswer())
        new5 = new4.getRight();
    else
        new5 = new4.getLeft();
    arr[levelNum].updateQuestion(new4,answer5);
    System.out.println();
  }
}