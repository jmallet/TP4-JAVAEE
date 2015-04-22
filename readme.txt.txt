create a web application
MALLET Julien and ZAIRI Ziad
23/04/2015


*** 1/ Introduction

This application is a web application for managing a book list and place an order.

*** 2/ Architecture

    Packages:

        Web :
                addBookForm.jsp
				ex2.jsp
				ex3-index.jsp
				ex3.jsp
				index.html
				inscription.jsp
            
        src/java :

            entity :
				Book
				BookItf -> interface
				BookRem
				Client
				Command
				CommandItf -> interface
				Commands
				Users
				UsersItf -> interface


            service :
				BookService
				CommandService
				User 

            servlet : 
                AddBook
				Authors
				Connexion
				Inscription
				SearchBook
            
        
    exceptions :
		BookService:
			public List<Book> searchBook(String title) throws NamingException { 
				return this.lookUp().search(title);
			}

			@Override
			public void setSessionContext(SessionContext ctx) throws EJBException, RemoteException {
      
			}
			
		AddBook:
		
		    * @throws ServletException if a servlet-specific error occurs
			* @throws IOException if an I/O error occurs
			*/
			@Override
			protected void doGet(HttpServletRequest request, HttpServletResponse response)
					throws ServletException, IOException {
				try {
					processRequest(request, response);
				} catch (NamingException ex) {
					Logger.getLogger(AddBook.class.getName()).log(Level.SEVERE, null, ex);
				}
			}		
		
		
	Authors:
		
		protected void processRequest(HttpServletRequest request,  HttpServletResponse response)
            throws ServletException, IOException, NamingException {
        
        try {
            HttpSession session = request.getSession(true);
            session.getAttribute("USER").equals(1);            
            List<String> authors = book.listAuthors();
            response.setContentType( "text/html" );
            PrintWriter out = response.getWriter();
            out.println( "<html><body>" ); 
            out.println( "<h1>Liste des auteurs :</h1><ul>" );
            for (String author : authors)
            out.println( "<li>"+author+"</li>" );
            out.println( "</ul><a href=\"ex3-index.jsp\">Retour</a>/body></html>" );
        }
        catch (IOException e) {
            response.sendRedirect(response.encodeRedirectURL("ex3.jsp"));
        }
		
		
			
*** 3/ code samples
    
   addbook:
	
	add a book :
	
	protected void processRequest(HttpServletRequest request,  HttpServletResponse response)
            throws ServletException, IOException, NamingException {
        String author = request.getParameter("author");
        String title = request.getParameter("title");
        String date = request.getParameter("date");            
            book.add(title, author, Integer.parseInt(date));
        response.sendRedirect(response.encodeRedirectURL("ex3-index.jsp"));           
    }

	
	authors:
	
    display list author
	
	protected void processRequest(HttpServletRequest request,  HttpServletResponse response)
            throws ServletException, IOException, NamingException {
        
        try {
            HttpSession session = request.getSession(true);
            session.getAttribute("USER").equals(1);            
            List<String> authors = book.listAuthors();
            response.setContentType( "text/html" );
            PrintWriter out = response.getWriter();
            out.println( "<html><body>" ); 
            out.println( "<h1>Liste des auteurs :</h1><ul>" );
            for (String author : authors)
            out.println( "<li>"+author+"</li>" );
            out.println( "</ul><a href=\"ex3-index.jsp\">Retour</a>/body></html>" );
        }
        catch (IOException e) {
            response.sendRedirect(response.encodeRedirectURL("ex3.jsp"));
        }
         
    }
    
    user connexion:
	
	
	@EJB
    User user1;

 
    protected void processRequest(HttpServletRequest request,  HttpServletResponse response)
            throws ServletException, IOException, NamingException {
        
        try {
            String us = request.getParameter("user");
            String mdp = request.getParameter("password");
            
            if (!user1.CheckCouple(us, mdp)) {
                response.sendRedirect(response.encodeRedirectURL("ex3-index.jsp"));
            }
            else {
                HttpSession session = request.getSession(true);
                session.setAttribute( "LOGIN", us );
                response.sendRedirect(response.encodeRedirectURL("ex3.jsp"));
            }
           
            
        } catch (IOException ex) {
        }
        
        
    }
	
	
	