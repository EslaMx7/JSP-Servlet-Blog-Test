/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package web;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eslam
 */
public class DbManager implements IRepo{

    
    Connection con ;
    public DbManager(){
       
        
    
    }
    
    
    @Override
    public int Login(String username, String password) {

         try {
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con  = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=blogstrap","dbAdmin","Admin");

            PreparedStatement sql = con.prepareStatement("SELECT COUNT(*) FROM Users WHERE Username=? AND Password=?");
            sql.setString(1, username);
            sql.setString(2, password);

            
            ResultSet res=  sql.executeQuery();
            res.next();
            
            return res.getInt(1);
            
            
            

        } catch (SQLException ex) {
            Logger.getLogger(DbManager.class.getName()).log(Level.SEVERE, "ex happened !!!", ex);
            return 0;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DbManager.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }catch(Exception ex){
           Logger.getLogger(DbManager.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
           return 0;
        }finally{
             try {
                 con.close();
             } catch (SQLException ex) {
                 Logger.getLogger(DbManager.class.getName()).log(Level.SEVERE, null, ex);
             }
         }

    }

    @Override
    public int Register(User user) {
        try {
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
             con  = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=blogstrap","dbAdmin","Admin");

            PreparedStatement sql = con.prepareStatement("INSERT INTO Users VALUES(?,?,?,?,?,?)");
            sql.setString(1, user.Username);
            sql.setString(2, user.Email);
            sql.setString(3, user.Password);
            sql.setBoolean(4, user.IsAdmin);
            sql.setString(5, user.LastLogin);
            sql.setBoolean(6, user.IsActive);
            
            sql.execute();
            
              return 1;
            
            
        } catch (SQLException ex) {
            Logger.getLogger(DbManager.class.getName()).log(Level.SEVERE, "ex happened !!!", ex);
            return 0;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DbManager.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }catch(Exception ex){
           Logger.getLogger(DbManager.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
           return 0;
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(DbManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
       
    }

    @Override
    public User GetUser(String byUsername) {
         try {
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
             con  = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=blogstrap","dbAdmin","Admin");

             User user = new User();
             
            PreparedStatement sql = con.prepareStatement("SELECT * FROM Users WHERE Username=?");
            sql.setString(1, byUsername);

            ResultSet res = sql.executeQuery();
            res.next();
            
            user.ID = res.getInt(1);
            user.Username = res.getString(2);
            user.Email = res.getString(3);
            user.Password = res.getString(4);
            user.IsAdmin = res.getBoolean(5);
            user.LastLogin = res.getString(6);
            user.IsActive = res.getBoolean(7);
            
              return user;
            
            
        } catch (SQLException ex) {
            Logger.getLogger(DbManager.class.getName()).log(Level.SEVERE, "ex happened !!!", ex);
            return null;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DbManager.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }catch(Exception ex){
           Logger.getLogger(DbManager.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
           return null;
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(DbManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public List<Post> GetAllPosts() {
        try {
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
             con  = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=blogstrap","dbAdmin","Admin");
             
             Post post;
             List<Post>  posts = new ArrayList<Post>();
            PreparedStatement sql = con.prepareStatement("SELECT * FROM Posts");
            
            ResultSet res = sql.executeQuery();
           while( res.next()){
            post = new Post();
            post.ID = res.getInt(1);
            post.PostTitle = res.getString(2);
            post.PostContent = res.getString(3);
            post.PostDescription = res.getString(4);
            post.PostImage = res.getString(5);
            post.PublishDate = res.getString(6);
            post.PostAuthor = res.getString(7);
            post.IsVisiable = res.getBoolean(8);
            post.AllowComments = res.getBoolean(9);
           posts.add(post);
           }
              return posts;
            
            
        } catch (SQLException ex) {
            Logger.getLogger(DbManager.class.getName()).log(Level.SEVERE, "ex happened !!!", ex);
            return null;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DbManager.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }catch(Exception ex){
           Logger.getLogger(DbManager.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
           return null;
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(DbManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public Post GetPost(int ID) {
        try {
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
             con  = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=blogstrap","dbAdmin","Admin");

             Post post = new Post();
             
            PreparedStatement sql = con.prepareStatement("SELECT * FROM Posts WHERE ID=?");
            sql.setInt(1, ID);

            ResultSet res = sql.executeQuery();
            res.next();
            
            post.ID = res.getInt(1);
            post.PostTitle = res.getString(2);
            post.PostContent = res.getString(3);
            post.PostDescription = res.getString(4);
            post.PostImage = res.getString(5);
            post.PublishDate = res.getString(6);
            post.PostAuthor = res.getString(7);
            post.IsVisiable = res.getBoolean(8);
            post.AllowComments = res.getBoolean(9);
            
              return post;
            
            
        } catch (SQLException ex) {
            Logger.getLogger(DbManager.class.getName()).log(Level.SEVERE, "ex happened !!!", ex);
            return null;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DbManager.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }catch(Exception ex){
           Logger.getLogger(DbManager.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
           return null;
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(DbManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public int UpdatePost(int ID, Post newPost) {
        try {
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
             con  = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=blogstrap","dbAdmin","Admin");

             
             
            PreparedStatement sql = con.prepareStatement("UPDATE Posts SET PostTitle=?,PostContent=?,PostDescribtion=?,PostImage=?,PublishDate=?,PostAuthor=?,IsVisiable=?,AllowComments=? WHERE ID=?");
            
            sql.setString(1, newPost.PostTitle);
            sql.setString(2, newPost.PostContent);
            sql.setString(3, newPost.PostDescription);
            sql.setString(4, newPost.PostImage);
            sql.setString(5, newPost.PublishDate);
            sql.setString(6, newPost.PostAuthor);
            sql.setBoolean(7, newPost.IsVisiable);
            sql.setBoolean(8, newPost.AllowComments);
            sql.setInt(9, ID);

            sql.executeUpdate();
            
            
              return 1;
            
            
        } catch (SQLException ex) {
            Logger.getLogger(DbManager.class.getName()).log(Level.SEVERE, "ex happened !!!", ex);
            return 0;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DbManager.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }catch(Exception ex){
           Logger.getLogger(DbManager.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
           return 0;
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(DbManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public int DeletePost(int ID) {
       try {
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
             con  = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=blogstrap","dbAdmin","Admin");

             Post post = new Post();
             
            PreparedStatement sql = con.prepareStatement("DELETE FROM Posts WHERE ID=?");
            sql.setInt(1, ID);

            sql.execute();
            
              return 1;
            
            
        } catch (SQLException ex) {
            Logger.getLogger(DbManager.class.getName()).log(Level.SEVERE, "ex happened !!!", ex);
            return 0;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DbManager.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }catch(Exception ex){
           Logger.getLogger(DbManager.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
           return 0;
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(DbManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public List<Post> SearchPosts(String title){
    
         try {
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
             con  = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=blogstrap","dbAdmin","Admin");
             
             Post post;
             List<Post>  posts = new ArrayList<Post>();
            PreparedStatement sql = con.prepareStatement("SELECT * FROM Posts WHERE PostTitle LIKE '%"+title+"%'");
            
            ResultSet res = sql.executeQuery();
           while( res.next()){
            post = new Post();
            post.ID = res.getInt(1);
            post.PostTitle = res.getString(2);
            post.PostContent = res.getString(3);
            post.PostDescription = res.getString(4);
            post.PostImage = res.getString(5);
            post.PublishDate = res.getString(6);
            post.PostAuthor = res.getString(7);
            post.IsVisiable = res.getBoolean(8);
            post.AllowComments = res.getBoolean(9);
           posts.add(post);
           }
              return posts;
            
            
        } catch (SQLException ex) {
            Logger.getLogger(DbManager.class.getName()).log(Level.SEVERE, "ex happened !!!", ex);
            return null;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DbManager.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }catch(Exception ex){
           Logger.getLogger(DbManager.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
           return null;
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(DbManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    @Override
    public int InsertPost(Post post) {
        try {
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
             con  = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=blogstrap","dbAdmin","Admin");

            PreparedStatement sql = con.prepareStatement("INSERT INTO Posts VALUES(?,?,?,?,?,?,?,?)");
            sql.setString(1, post.PostTitle);
            sql.setString(2, post.PostContent);
            sql.setString(3, post.PostDescription);
            sql.setString(4, post.PostImage);
            sql.setString(5, post.PublishDate);
            sql.setString(6, post.PostAuthor);
            sql.setBoolean(7, post.IsVisiable);
            sql.setBoolean(8, post.AllowComments);
            sql.execute();
            
              return 1;
            
            
        } catch (SQLException ex) {
            Logger.getLogger(DbManager.class.getName()).log(Level.SEVERE, "ex happened !!!", ex);
            return 0;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DbManager.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }catch(Exception ex){
           Logger.getLogger(DbManager.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
           return 0;
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(DbManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
       
    }

    
}
