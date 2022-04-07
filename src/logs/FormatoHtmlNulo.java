package logs;

import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class FormatoHtmlNulo extends Formatter {

	@Override
	public String format(LogRecord record) {
		String[] array = record.getMessage().split(" ");
		return "<tr>\n<td>\n"+array[0]+"</td>\n <td>"+array[1]+"</td>\n <td>"+array[2]+"</td>\n <td>"+array[3]+"</td>\n</tr>\n";
	}
	@Override
    public String getHead(Handler h) {
        return "<HTML>\n <head>\n<link rel=\"stylesheet\"  href=\"style.css\">\n</head>\n  <BODY> \n  <TABLE> \n <tr> \n <th>Operación</th> \n <th>Operando 1</th> \n  <th>Operando 2</th> \n  <th>Resultado</th> ";
    }
	@Override
    public String getTail(Handler h) {
        return "</TABLE> \n </BODY> \n </HTML>\n";
    }
}