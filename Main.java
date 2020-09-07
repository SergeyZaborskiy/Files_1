public class Main {
    public static void main(String[] args) {
        FileExplorer fileExplorer = new FileExplorer();


        fileExplorer.createDirectory("D://TestSetup//src");
        fileExplorer.createDirectory("D://TestSetup//res");
        fileExplorer.createDirectory("D://TestSetup//savegames");
        fileExplorer.createDirectory("D://TestSetup//temp");

        fileExplorer.createDirectory("D://TestSetup//src//main");
        fileExplorer.createDirectory("D://TestSetup//src//tmp");

        fileExplorer.createFile("D://TestSetup//src//main//Main.java");
        fileExplorer.createFile("D://TestSetup//src//main//Util.java");

        fileExplorer.createDirectory("D://TestSetup//res//drawables");
        fileExplorer.createDirectory("D://TestSetup//res//vectors");
        fileExplorer.createDirectory("D://TestSetup//res//icons");

        fileExplorer.createFile("D://TestSetup//temp//temp.txt");

        fileExplorer.writeLogToFile("D://TestSetup//temp//temp.txt");

        //на диске D все успешно создалось
        //Продублирую создание лога temp.txt в локальную папку

        fileExplorer.createFile("src//temp.txt");
        fileExplorer.writeLogToFile("src//temp.txt");
    }
}
