
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.security.NoSuchAlgorithmException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.lang.Integer;
import model.*;


/**
 * Servlet implementation class UtenzeServlet
 */
@WebServlet("/UtenzeServlet")
public class UtenzeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		
		response.setContentType("text/HTML");
		PrintWriter out = response.getWriter();
		
		out.println("helloo");

		  //String wb=request.getParameter("action");
	     // if(wb.equalsIgnoreCase("Add")){
		     	/*boolean res = false;
		     	String id=request.getParameter("id");
		     	String nome=request.getParameter("nome");
		     	String cognome=request.getParameter("cognome");
		     	String sede_di_lavoro= request.getParameter("sede_di_lavoro");
			    String data_nascita = request.getParameter("data_nascita");			
				String luogo_nascita= request.getParameter("luogo_nascita");
				String residenza= request.getParameter("residenza");
				String indirizzo=request.getParameter("indirizzo");
				//int cap=Integer.parseInt(request.getParameter("cap"));
				String cf=request.getParameter("cf");
				String iban= request.getParameter("iban");
				String contratto= request.getParameter("contratto");
				String tipo_cont= request.getParameter("tipo_cont");
				//int ore_giorno=Integer.parseInt(request.getParameter("ore_giorno"));
				String data_iniz_contr = request.getParameter("data_iniz_contr");
				//int durata_cont=Integer.parseInt(request.getParameter("durata_cont"));
				//int costo_mensile= Integer.parseInt(request.getParameter("costo_mensile")); 
				//int periodo_perm_az= Integer.parseInt(request.getParameter("periodo_perm_az"));	
				//int attivo=Integer.parseInt(request.getParameter("attivo"));
				String telefono= request.getParameter("telefono");
				String cellulare= request.getParameter("cellulare");
				String email= request.getParameter("email");
				String skype= request.getParameter("skype");
				String password= request.getParameter("password");	
				Part photo = request.getPart("photo");
				
				if(photo!=null){
					InputStream input = photo.getInputStream();
					if(input!=null){
						byte[] photoByte = new byte[input.available()];
						input.read(photoByte);
						UtenzeDaoImp u = new UtenzeDaoImp();
					    try {
							//res = u.addUtenze(id, nome, cognome, sede_di_lavoro, data_nascita, luogo_nascita, residenza, indirizzo, cap, cf, iban, contratto, tipo_cont, ore_giorno, data_iniz_contr, durata_cont, costo_mensile, periodo_perm_az, attivo, telefono, cellulare, email, skype, password, photoByte);
					    	res = u.addUtenze2(id, nome, cognome, sede_di_lavoro, data_nascita, luogo_nascita, residenza, indirizzo, iban, contratto, tipo_cont, data_iniz_contr, telefono, cellulare, email, skype, password, photoByte);
						} catch (NoSuchAlgorithmException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						if(res==true){
							out.print("successfully saved");
						}
						else{
							out.print("Error");
							}
					}
			   }*/
	      }
}

