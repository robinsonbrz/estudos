package br.com.vivo.xereta.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQuery;


/**
 * The persistent class for the LOGEAI database table.
 * 
 */
@Entity
@NamedQuery(name="Logeai.findAll", query="SELECT l FROM Logeai l")
public class Logeai implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String internalid;

	@Column(name="\"ACTION\"")
	private String action;

	private String clientdomain;
	
	
	private BigDecimal clientlogtype;

	private String clientname;

	private String componentname;

	private Timestamp dateevent;
	
	private BigDecimal dia;

	@Lob
	private String javastacktrace;

	private String legacyname;

	private String loginname;

	private String password;

	@Lob
	private String remotedescription;

	private String remoteerror;

	private String sequenceid;

	private String soatag;

	private String subprocessname;

	@Lob
	private String tracemsg;

	private String trackingid;

	public Logeai() {
	}

	public String getInternalid() {
		return this.internalid;
	}

	public void setInternalid(String internalid) {
		this.internalid = internalid;
	}

	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getClientdomain() {
		return this.clientdomain;
	}

	public void setClientdomain(String clientdomain) {
		this.clientdomain = clientdomain;
	}

	public BigDecimal getClientlogtype() {
		return this.clientlogtype;
	}

	public void setClientlogtype(BigDecimal clientlogtype) {
		this.clientlogtype = clientlogtype;
	}

	public String getClientname() {
		return this.clientname;
	}

	public void setClientname(String clientname) {
		this.clientname = clientname;
	}

	public String getComponentname() {
		return this.componentname;
	}

	public void setComponentname(String componentname) {
		this.componentname = componentname;
	}

	public Timestamp getDateevent() {
		return this.dateevent;
	}

	public void setDateevent(Timestamp dateevent) {
		this.dateevent = dateevent;
	}

	public BigDecimal getDia() {
		return this.dia;
	}

	public void setDia(BigDecimal dia) {
		this.dia = dia;
	}

	public String getJavastacktrace() {
		return this.javastacktrace;
	}

	public void setJavastacktrace(String javastacktrace) {
		this.javastacktrace = javastacktrace;
	}

	public String getLegacyname() {
		return this.legacyname;
	}

	public void setLegacyname(String legacyname) {
		this.legacyname = legacyname;
	}

	public String getLoginname() {
		return this.loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRemotedescription() {
		return this.remotedescription;
	}

	public void setRemotedescription(String remotedescription) {
		this.remotedescription = remotedescription;
	}

	public String getRemoteerror() {
		return this.remoteerror;
	}

	public void setRemoteerror(String remoteerror) {
		this.remoteerror = remoteerror;
	}

	public String getSequenceid() {
		return this.sequenceid;
	}

	public void setSequenceid(String sequenceid) {
		this.sequenceid = sequenceid;
	}

	public String getSoatag() {
		return this.soatag;
	}

	public void setSoatag(String soatag) {
		this.soatag = soatag;
	}

	public String getSubprocessname() {
		return this.subprocessname;
	}

	public void setSubprocessname(String subprocessname) {
		this.subprocessname = subprocessname;
	}

	public String getTracemsg() {
		return this.tracemsg;
	}

	public void setTracemsg(String tracemsg) {
		this.tracemsg = tracemsg;
	}

	public String getTrackingid() {
		return this.trackingid;
	}

	public void setTrackingid(String trackingid) {
		this.trackingid = trackingid;
	}

}