<!DOCTYPE html>
<html lang="en" dir="ltr">
   <head>
      <meta charset="utf-8">
      <title>Admin- Gestion des cat�gories</title>
      <link href="style/forms.css" rel="stylesheet" type="text/css"/>
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
   </head>
   <body>
        <%@include file="sidebar.html" %>
    <div class="container">
        <div class="text">Ajouter une cat�gorie</div>
        <form action="admin/AddCategorie" method="GET">

           <div class="form-row">
              <div class="input-data">
                 <input type="text"class="form-control" id="uname" name="categorie" required>
                 <div class="underline"></div>
                 <label for="">Nom de la cat�gorie:</label>
              </div>   
           </div>
          
           
            <div class="form-row submit-btn">
                <div class="input-data">
                    <div class="inner"></div>
                    <input type="submit" value="Ajouter la cat�gorie">
                </div>
                </div>
        </form>
     </div>
   </body>
</html>