package logs;

import java.util.logging.Filter;
import java.util.logging.LogRecord;

public class FiltroSoloResultadoNulo implements Filter {

	public boolean isLoggable(LogRecord record) {
		boolean crearLog = false;
		String[] array =  record.getMessage().split(" ");
		if (array[array.length-1].equals("0")){
			crearLog = true;			
		}
		return crearLog;
	}

	

	

}

