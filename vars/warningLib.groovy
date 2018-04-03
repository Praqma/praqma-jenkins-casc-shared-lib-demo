import java.util.Random

def create(message) {	
	Random rand = new Random()
	echo "app.java:${rand.nextInt(100000)+1}:SEVERE:${message}"
}