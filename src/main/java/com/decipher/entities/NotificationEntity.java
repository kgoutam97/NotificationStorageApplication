package com.decipher.entities;

public class NotificationEntity {

	private String notificationType;
	private int user;
	private String notifyTime;
	private String dateCreated;
	private String lastUpdated;
	private boolean enabled;
	private boolean isSent;
	private boolean isRepeat;

	public String getNotificationType() {
		return notificationType;
	}

	public void setNotificationType(String notificationType) {
		this.notificationType = notificationType;
	}

	public int getUser() {
		return user;
	}

	public void setUser(int user) {
		this.user = user;
	}

	public String getNotifyTime() {
		return notifyTime;
	}

	public void setNotifyTime(String notifyTime) {
		this.notifyTime = notifyTime;
	}

	public String getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(String lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public boolean isSent() {
		return isSent;
	}

	public void setSent(boolean isSent) {
		this.isSent = isSent;
	}

	public boolean isRepeat() {
		return isRepeat;
	}

	public void setRepeat(boolean isRepeat) {
		this.isRepeat = isRepeat;
	}

	@Override
	public String toString() {
		return "NotificationEntity [notificationType=" + notificationType + ", user=" + user + ", notifyTime="
				+ notifyTime + ", dateCreated=" + dateCreated + ", lastUpdated=" + lastUpdated + ", enabled=" + enabled
				+ ", isSent=" + isSent + ", isRepeat=" + isRepeat + "]";
	}

}
