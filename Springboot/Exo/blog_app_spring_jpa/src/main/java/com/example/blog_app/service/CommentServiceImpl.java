package com.example.blog_app.service;

import com.example.blog_app.model.CommentDTO;
import com.example.blog_app.model.PostDTO;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CommentServiceImpl implements IBlogServcie<CommentDTO> {

    private Map<UUID, PostDTO> postComments;
    public CommentServiceImpl(List<PostDTO> posts) {
        // Initialisation postComments éviter l'erreur de NullPointerException
        postComments = new HashMap<>();
        for (PostDTO post : posts) {
            postComments.put(post.getId(), post);
        }
        // Ajout de commentaires à chaque article
        for (PostDTO post : posts) {
            List<CommentDTO> comments = post.getComments();

            CommentDTO comment1 = CommentDTO.builder()
                    .id(UUID.randomUUID())
                    .fullName("Jean Martin")
                    .email("jean@hotmail.fr")
                    .content("Ce cours est très complet (même pour un débutant). Bien évidemment, il faudra avoir certaines notions afin de bien suivre le contenu.")
                    .build();
            CommentDTO comment2 = CommentDTO.builder()
                    .id(UUID.randomUUID())
                    .fullName("Julie Dubois")
                    .email("julie@yahoo.fr")
                    .content("Les conseils très instructif et formateur très pédagogue, comme dans tous ses autres cours . Merci pour la disponibilité aussi !")
                    .build();
            CommentDTO comment3 = CommentDTO.builder()
                    .id(UUID.randomUUID())
                    .fullName("Thomas Bernard")
                    .email("thomas@wanadoo.fr")
                    .content("Je suis vraiment impressionné par la qualité de ce cours. J'ai déjà suivi plusieurs formations en ligne, mais celle-ci se distingue vraiment. Bravo à toute l'équipe pour ce travail exceptionnel !")
                    .build();
            CommentDTO comment4 = CommentDTO.builder()
                    .id(UUID.randomUUID())
                    .fullName("Sophie Leroy")
                    .email("sophie@gmail.com")
                    .content("Je suis agréablement surprise par la qualité de ce cours. Les explications sont claires et bien structurées. Merci beaucoup !")
                    .build();
            CommentDTO comment5 = CommentDTO.builder()
                    .id(UUID.randomUUID())
                    .fullName("Laura Martinez")
                    .email("laura@example.com")
                    .content("Ce webinaire a été une révélation pour moi. Les concepts sont expliqués de manière claire et concise, ce qui m'a permis de mieux comprendre certains sujets difficiles. Merci pour cette ressource précieuse !")
                    .build();

            comments.add(comment1);
            comments.add(comment2);
            comments.add(comment3);
            comments.add(comment4);
            comments.add(comment5);

        }

    }


    @Override
    public List<CommentDTO> getAll() {
        List<CommentDTO> allComments = new ArrayList<>();
        // Récupérer tous les commentaires de tous les articles
        for (PostDTO post : postComments.values()) {
            allComments.addAll(post.getComments());
        }
        return allComments;
    }

    @Override
    public CommentDTO getById(UUID id) {
        // Rechercher le commentaire dans tous les articles
        for (PostDTO post : postComments.values()) {
            for (CommentDTO comment : post.getComments()) {
                if (comment.getId().equals(id)) {
                    return comment;
                }
            }
        }
        return null;
    }
    // Méthode pour ajouter un commentaire à un article spécifique
    public boolean addCommentToPost(UUID postId, CommentDTO comment) {
        if (postComments.containsKey(postId)) {
            PostDTO post = postComments.get(postId);
            List<CommentDTO> comments = post.getComments();
            comments.add(comment);
            System.out.println("Le commentaire a été ajouté avec succès à l'article spécifié");
            return true;
        }
        System.out.println("L'article spécifié n'existe pas dans la carte postComments");
        return false;
    }
    @Override
    public Boolean add(CommentDTO element) {
        return null;
    }

    @Override
    public Boolean deleteById(UUID id) {
        return null;
    }

    @Override
    public CommentDTO update(UUID id, CommentDTO element) {
        return null;
    }
}
