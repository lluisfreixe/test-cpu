package cat.dgp.openshift;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controlador {
	
	// VERSIO 1
	
	String appName = "test-cpu";

	@GetMapping("/entrada")
	public String entrada(Model model) {
		String capacitat = cpu();
		String data = obtenirData();
		String hora = obtenirHora();
		model.addAttribute("appName", appName);
		model.addAttribute("capacitat", capacitat);
		model.addAttribute("data", data);
		model.addAttribute("hora", hora);
	    return "inici";
	  }
	
	private String obtenirData () {
		Date date = new Date();
		DateFormat formatData = DateFormat.getDateInstance(DateFormat.SHORT);
		String data = formatData.format(date);
		return data;
	}

	private String obtenirHora () {
		Date date = new Date();
		DateFormat formatHora = new SimpleDateFormat("HH:mm:ss");
		String hora = formatHora.format(date);
		return hora;
	}

	private String cpu () {
		DecimalFormat formatoImporte = new DecimalFormat("###,###,###.##");
		String cap = formatoImporte.format(10000000);
		double cadena = 0;
		for (int i=0; i <= 10000000; i++) {
			cadena = cadena + (((10 * 3344) / 0.9876) - 500.234) / 3344;
		}
		System.out.println("metode cpu executat.");
		return cap;
	}

}
