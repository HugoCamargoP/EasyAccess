package com.cutieOS.services;

import com.cutieOS.entity.Invitation;
import com.cutieOS.repository.iInvitation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvitationDao {

    @Autowired
    com.cutieOS.repository.iInvitation iInvitation;

    public List<Invitation> getAllInvitation(){
        return iInvitation.findAll();
    }

    public boolean insertInvitation(Invitation invitation){
        if(iInvitation.save(invitation) != null)
            return true;

        return false;
    }

    public Invitation modificarInvitation(Invitation invitation){
        return iInvitation.save(invitation);
    }








}
