package com.cutieOS.controller;

import com.cutieOS.entity.Invitation;
import com.cutieOS.services.InvitationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InvitationController {

    @Autowired
    InvitationDao invitationDao;

    @GetMapping ("/invitation")
        public List<Invitation> getAllInvitation(){
        return invitationDao.getAllInvitation();
        }

     @PostMapping("/invitation")
      public boolean insertPersona(@RequestBody Invitation invitation){
        return invitationDao.insertInvitation(invitation);

     }

     @PutMapping("/invitation/{id_invitation}")
    public Invitation modificarInvitation(@RequestBody Invitation invitation, @PathVariable int id_invitation){

        invitation.setId_invitation(id_invitation);
        return invitationDao.modificarInvitation(invitation);
     }






}












