import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

public class Game {
	
	public void initialize(File inputFile) throws Exception{
		BufferedReader br = new BufferedReader(new FileReader(inputFile));
		
		// Read the first of the input file
		String line = br.readLine();
		int M = Integer.parseInt(line.split(" ")[0]);
		int N = Integer.parseInt(line.split(" ")[1]);
		
		// To do: define a map
		Map CurMap= new Map();
		// Read the following M lines of the Map
		for (int i = 0; i < M; i++) {
			line = br.readLine();
			char[] mapChar = line.toCharArray();
			int mark=0;
			for(char a:mapChar)
			{
				Position Temp = new Position();
				switch(a)
				{
					case('#'):
						Temp.setPosition(i, mark, "Wall");
					case(' '):
						Temp.setPosition(i, mark, "Road");
					case('P'):
						Temp.setPosition(i, mark, "Pokemon");
					case('S'):
						Temp.setPosition(i, mark, "Station");
					case('B'):
						Temp.setPosition(i, mark, "Begin");
					case('D'):
						Temp.setPosition(i, mark, "End");
				}
				CurMap.setMap(Temp);
				mark++;
			}
			// to do
			// Read the map line by line
		}
		
		// to do
		// Find the number of stations and pokemons in the map 
		// Continue read the information of all the stations and pokemons by using br.readLine();
		
		br.close();
	}
	
	public static void main(String[] args) throws Exception{
		File inputFile = new File("./sampleIn.txt");
		File outputFile = new File("./sampleOut.txt");
		
		if (args.length > 0) {
			inputFile = new File(args[0]);
		} 

		if (args.length > 1) {
			outputFile = new File(args[1]);
		}
		
		Game game = new Game();
		game.initialize(inputFile);
		// TO DO 
		// Read the configures of the map and pokemons from the file inputFile
		// and output the results to the file outputFile
	}
}
