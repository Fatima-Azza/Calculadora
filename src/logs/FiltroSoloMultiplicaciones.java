package logs;

import java.util.logging.Filter;
import java.util.logging.LogRecord;

public class FiltroSoloMultiplicaciones implements Filter {

	@Override
	public boolean isLoggable(LogRecord record) {
		boolean crearLog = false;
		if (record != null && record.getMessage() != null && record.getMessage().contains("*")){
			crearLog = true;			
		}
		return crearLog;
	}

}
