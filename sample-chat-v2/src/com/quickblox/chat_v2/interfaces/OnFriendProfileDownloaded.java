package com.quickblox.chat_v2.interfaces;

import com.quickblox.module.users.model.QBUser;

public interface OnFriendProfileDownloaded {
	
	public void downloadComlete(QBUser friend);
}