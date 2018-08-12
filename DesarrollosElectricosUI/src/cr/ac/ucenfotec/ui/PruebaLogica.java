package cr.ac.ucenfotec.ui;

import cr.ac.ucenfotec.entities.*;
import cr.ac.ucenfotec.logic.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.sql.SQLException;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PruebaLogica {
	
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintStream out = System.out;

	public static void main(String[] args) throws IOException {
		
		mostrarMenu();	
	}
	
	public static void mostrarMenu() throws java.io.IOException {

        byte opcion = -1;

        try {
            do {
                out.println("\nMenu\n");
                out.println("1. Administrativo");
                out.println("2. Iniciar sesion");
                out.println("3. Salir");
                opcion = Byte.parseByte(in.readLine());
                procesarOpcion(opcion);
            } while (opcion != 3);

            out.println("Usted eligio " + opcion + " salir del sistema");

        } catch (Exception e) {
            out.println(e.getMessage());
        }

    }
		
	public static void procesarOpcion(byte pOpcion) throws IOException {
		
		switch (pOpcion) {
		
		case 1:
			loginAdmin();
			break;	
		default:
			break;	
		
		}
		
	}
	
	public static void loginAdmin() throws java.io.IOException {
		Optional<GestorMaster> gestorU = GestorFactory.createGestor(GestorType.USUARIO);
		Usuario u = new Usuario();
		String id,clave;
		
		try {

            out.println("Digite id");
            id = in.readLine();         
            out.println("Digite su clave");
            clave = in.readLine();

            u.setId(id);
            u.setClave(clave);
            u = (Usuario) gestorU.get().retrive(u);

            if (u != null) {
                out.println("\nBienvenido al sistema\n");
                menuadmin();
   
            } else {
                out.println("\nNo hay concordancia entre el usuario y la clave introducidos\n");
            }

        } catch (Exception e) {
            out.println(e.getMessage());
        }
		
	}
	
	public static void menuadmin() throws java.io.IOException {

        byte opcion = -1;

        do {
            out.println("\nMenu administrador\n");
            out.println("1. Crear nuevo tramite");
            out.println("2. Listar tramites");
            out.println("3. Registrar usuario nuevo");
            out.println("4. Salir");
            opcion = Byte.parseByte(in.readLine());
            procesarOpcionAdmin(opcion);
        } while (opcion != 4);

        out.println("Usted eligio " + opcion + " cerrar seccion");

    }
	
	public static void procesarOpcionAdmin(byte pOpcion) throws java.io.IOException {

        switch (pOpcion) {

            case 1:
//                crearTramite();
                break;
            case 2:
//            	listarTramite();
              break;
            case 3:
//                registrarUsuario();
                break;
            case 4:
                break;
            default:
                out.println("opcion invalida");
                break;

        }
    }
	
//	public static void crearTramite() {
//		String detalleTramite, nombreTarea, nombreArea, detalle;
//		int numero;
//		Tramite tramite = new Tramite();
//		
//		Optional<GestorMaster> GTR = GestorFactory.createGestor(GestorType.TRAMITE);
//		Optional<GestorMaster> GTA = GestorFactory.createGestor(GestorType.TAREA);
//		Optional<GestorMaster> GA = GestorFactory.createGestor(GestorType.ACTIVIDAD);
//		Optional<GestorMaster> GAF = GestorFactory.createGestor(GestorType.AREAFUNCIONAL);
//		ArrayList<Tramite> listTramite = new ArrayList<>(); 
//		ArrayList<Tarea> listTarea = new ArrayList<>();
//		ArrayList<Actividad> listActividad = new ArrayList<>();
//		
//		try {			
//			out.println("\nDeme id Tramite");
//			int idTramite = Integer.parseInt(in.readLine());
//			tramite.setId(idTramite);
//			
//			do {
//				out.println("\nDeme detalle del proyecto o tramite");
//				detalleTramite = in.readLine();			
//			} while(detalleTramite.isEmpty());
//			
//			tramite.setDetalle(detalleTramite);
//			
//			int terminarTarea;
//			do {
//				Tarea tarea = new Tarea();
//				AreaFuncional area = new AreaFuncional();
//				
//				do {
//					out.println("\nDeme detalle de la tarea");
//					nombreTarea = in.readLine();					
//				} while(nombreTarea.isEmpty());				
//				
//				out.println("\nDeme id de la tarea");
//				int idTarea = Integer.parseInt(in.readLine());
//				out.println("\nDeme numero de tarea");
//				numero = Integer.parseInt(in.readLine());
//				
//				out.println("\nDeme id del area funcional");
//				int idArea = Integer.parseInt(in.readLine());	
//				
//				do {
//					out.println("\nDeme nombre del area funcional");
//					nombreArea = in.readLine();					
//				} while(nombreArea.isEmpty());
//				
//				tarea.setId(idTarea);
//				tarea.setNumero(numero);
//				tarea.setDetalle(nombreTarea);
//				
//				area.setId(idArea);
//				area.setNombre(nombreArea);
//				area.setTareaAsociada(idTarea);
//				GAF.get().create(area);
//			
//				int terminarActividad;
//				do {
//					Actividad actividad = new Actividad();
//					
//					out.println("\nDeme id de la actividad");
//					int idActividad = Integer.parseInt(in.readLine());
//					
//					do {
//						out.println("\nDeme detalle de la actividad");
//						detalle = in.readLine();					
//					}while(detalle.isEmpty());
//					
//					actividad.setId(idActividad);
//					actividad.setDetalle(detalle);
//					
//					listActividad.add(actividad);
//					
//					out.println("\n0.SEGUIR / 1.SALIR");
//					terminarActividad = Integer.parseInt(in.readLine());
//					
//				}while(terminarActividad == 0);
//				
//				tarea.setActividades(listActividad);
//				listTarea.add(tarea);
//				
//				out.println("\n0.Mas tareas / 1.SALIR");
//				terminarTarea = Integer.parseInt(in.readLine());
//				
//			}while(terminarTarea == 0);
//			
//			tramite.setTareas(listTarea);
//			GTR.get().create(tramite);
//			
//        } catch (Exception e) {
//            out.println(e.getMessage());
//        }
//	}
//	
//	public static void listarTramite() {
//		GestorTramite GTR = new GestorTramite();
//		GestorTarea GTA = new GestorTarea();
//		GestorActividad GA = new GestorActividad();
//		ArrayList<BaseEntity> listTramite = new ArrayList<>(); 
//		ArrayList<BaseEntity> listTarea = new ArrayList<>();
//		ArrayList<BaseEntity> listActividad = new ArrayList<>();
//		try {
//			
//			listTramite = GTR.RetriveAll();
//			listTarea = GTA.RetriveAll();
//			listActividad = GA.RetriveAll();
//			
//			out.println("\nTramites");
//			
//			for (BaseEntity entity: listTramite) {
//				Tramite tramite = (Tramite)entity;
//				
//				out.println("\n\n////////////////////////\n\n");
//												
//				out.println(tramite.toString());
//				
//				for (BaseEntity entity2: listTarea) {
//					Tarea tarea = (Tarea)entity2;
//					
//					if(tarea.getIdTramite() == tramite.getId()) {
//						
//						out.println(tarea.toString());
//						
//						for(BaseEntity entity3 : listActividad) {
//							Actividad actividad = (Actividad)entity3;
//							
//							if(actividad.getIdTarea() == tarea.getId()) {
//								
//								out.println(actividad.toString());
//							}
//						}
//					}
//					
//				}		
//				
//			}
//			
//		} catch (java.lang.ClassNotFoundException e) {
//            out.println(e.getMessage());
//        } catch (SQLException e) {
//            out.println(e.getMessage());
//            out.println(e.getErrorCode());
//        } catch (Exception e) {
//            out.println(e.getMessage());
//        }
//			
//	}
	
	
	

}
