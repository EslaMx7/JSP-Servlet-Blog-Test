/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package web;

import java.util.List;

/**
 *
 * @author Eslam
 */
public interface IRepo {
    
     int Login(String username,String password);
     int Register(User user);
     User GetUser(String byUsername);
     List<Post> GetAllPosts();
     List<Post> SearchPosts(String title);
     Post GetPost(int ID);
     int InsertPost(Post post);
     int UpdatePost(int ID,Post newPost);
     int DeletePost(int ID);
}
