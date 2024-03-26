import { getToken } from "../services/AuthService";

export const getUserDetails = () => {
    const token = getToken();
   
    if (!token) {
        console.log("No token found in localStorage.");
        return null;
    }

    // Séparer le token en ses parties
    const base64Url = token.split('.')[1];
    if (!base64Url) {
        console.log("Invalid token: missing payload.");
        return null;
    }

    // Remplacer les caractères de Base64Url par des caractères de Base64 standard
    const base64 = base64Url.replace(/-/g, '+').replace(/_/g, '/');
    
    // Décoder la chaîne Base64 en chaîne UTF-8
    const jsonPayload = decodeURIComponent(window.atob(base64).split('').map(function(c) {
        return '%' + ('00' + c.charCodeAt(0).toString(16)).slice(-2);
    }).join(''));

    // Parser la chaîne JSON en objet
    const decoded = JSON.parse(jsonPayload);
    console.log(decoded.id);

    // Supposant que les informations que vous souhaitez sont dans 'sub' et 'roles'
    return { name: decoded.sub, id: decoded.id , role: decoded.role};
};



