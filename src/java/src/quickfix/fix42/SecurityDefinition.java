package org.quickfix.fix42;
import org.quickfix.FieldNotFound;
import org.quickfix.Group;
import org.quickfix.field.*;

public class SecurityDefinition extends Message
{
  public SecurityDefinition()
  {
    getHeader().setField(new MsgType("d"));
  }
  public SecurityDefinition(
    org.quickfix.field.SecurityReqID aSecurityReqID,
    org.quickfix.field.SecurityResponseID aSecurityResponseID,
    org.quickfix.field.TotalNumSecurities aTotalNumSecurities ) {

    getHeader().setField(new MsgType("d"));
    set(aSecurityReqID);
    set(aSecurityResponseID);
    set(aTotalNumSecurities);
  }

  public void set(org.quickfix.field.SecurityReqID value)
  { setField(value); }
  public org.quickfix.field.SecurityReqID get(org.quickfix.field.SecurityReqID  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.SecurityReqID getSecurityReqID() throws FieldNotFound
  { org.quickfix.field.SecurityReqID value = new org.quickfix.field.SecurityReqID();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.SecurityReqID field)
  { return isSetField(field); }
  public boolean isSetSecurityReqID()
  { return isSetField(320); }
  public void set(org.quickfix.field.SecurityResponseID value)
  { setField(value); }
  public org.quickfix.field.SecurityResponseID get(org.quickfix.field.SecurityResponseID  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.SecurityResponseID getSecurityResponseID() throws FieldNotFound
  { org.quickfix.field.SecurityResponseID value = new org.quickfix.field.SecurityResponseID();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.SecurityResponseID field)
  { return isSetField(field); }
  public boolean isSetSecurityResponseID()
  { return isSetField(322); }
  public void set(org.quickfix.field.SecurityResponseType value)
  { setField(value); }
  public org.quickfix.field.SecurityResponseType get(org.quickfix.field.SecurityResponseType  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.SecurityResponseType getSecurityResponseType() throws FieldNotFound
  { org.quickfix.field.SecurityResponseType value = new org.quickfix.field.SecurityResponseType();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.SecurityResponseType field)
  { return isSetField(field); }
  public boolean isSetSecurityResponseType()
  { return isSetField(323); }
  public void set(org.quickfix.field.TotalNumSecurities value)
  { setField(value); }
  public org.quickfix.field.TotalNumSecurities get(org.quickfix.field.TotalNumSecurities  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.TotalNumSecurities getTotalNumSecurities() throws FieldNotFound
  { org.quickfix.field.TotalNumSecurities value = new org.quickfix.field.TotalNumSecurities();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.TotalNumSecurities field)
  { return isSetField(field); }
  public boolean isSetTotalNumSecurities()
  { return isSetField(393); }
  public void set(org.quickfix.field.Symbol value)
  { setField(value); }
  public org.quickfix.field.Symbol get(org.quickfix.field.Symbol  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.Symbol getSymbol() throws FieldNotFound
  { org.quickfix.field.Symbol value = new org.quickfix.field.Symbol();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.Symbol field)
  { return isSetField(field); }
  public boolean isSetSymbol()
  { return isSetField(55); }
  public void set(org.quickfix.field.SymbolSfx value)
  { setField(value); }
  public org.quickfix.field.SymbolSfx get(org.quickfix.field.SymbolSfx  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.SymbolSfx getSymbolSfx() throws FieldNotFound
  { org.quickfix.field.SymbolSfx value = new org.quickfix.field.SymbolSfx();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.SymbolSfx field)
  { return isSetField(field); }
  public boolean isSetSymbolSfx()
  { return isSetField(65); }
  public void set(org.quickfix.field.SecurityID value)
  { setField(value); }
  public org.quickfix.field.SecurityID get(org.quickfix.field.SecurityID  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.SecurityID getSecurityID() throws FieldNotFound
  { org.quickfix.field.SecurityID value = new org.quickfix.field.SecurityID();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.SecurityID field)
  { return isSetField(field); }
  public boolean isSetSecurityID()
  { return isSetField(48); }
  public void set(org.quickfix.field.IDSource value)
  { setField(value); }
  public org.quickfix.field.IDSource get(org.quickfix.field.IDSource  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.IDSource getIDSource() throws FieldNotFound
  { org.quickfix.field.IDSource value = new org.quickfix.field.IDSource();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.IDSource field)
  { return isSetField(field); }
  public boolean isSetIDSource()
  { return isSetField(22); }
  public void set(org.quickfix.field.SecurityType value)
  { setField(value); }
  public org.quickfix.field.SecurityType get(org.quickfix.field.SecurityType  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.SecurityType getSecurityType() throws FieldNotFound
  { org.quickfix.field.SecurityType value = new org.quickfix.field.SecurityType();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.SecurityType field)
  { return isSetField(field); }
  public boolean isSetSecurityType()
  { return isSetField(167); }
  public void set(org.quickfix.field.MaturityMonthYear value)
  { setField(value); }
  public org.quickfix.field.MaturityMonthYear get(org.quickfix.field.MaturityMonthYear  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.MaturityMonthYear getMaturityMonthYear() throws FieldNotFound
  { org.quickfix.field.MaturityMonthYear value = new org.quickfix.field.MaturityMonthYear();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.MaturityMonthYear field)
  { return isSetField(field); }
  public boolean isSetMaturityMonthYear()
  { return isSetField(200); }
  public void set(org.quickfix.field.MaturityDay value)
  { setField(value); }
  public org.quickfix.field.MaturityDay get(org.quickfix.field.MaturityDay  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.MaturityDay getMaturityDay() throws FieldNotFound
  { org.quickfix.field.MaturityDay value = new org.quickfix.field.MaturityDay();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.MaturityDay field)
  { return isSetField(field); }
  public boolean isSetMaturityDay()
  { return isSetField(205); }
  public void set(org.quickfix.field.PutOrCall value)
  { setField(value); }
  public org.quickfix.field.PutOrCall get(org.quickfix.field.PutOrCall  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.PutOrCall getPutOrCall() throws FieldNotFound
  { org.quickfix.field.PutOrCall value = new org.quickfix.field.PutOrCall();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.PutOrCall field)
  { return isSetField(field); }
  public boolean isSetPutOrCall()
  { return isSetField(201); }
  public void set(org.quickfix.field.StrikePrice value)
  { setField(value); }
  public org.quickfix.field.StrikePrice get(org.quickfix.field.StrikePrice  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.StrikePrice getStrikePrice() throws FieldNotFound
  { org.quickfix.field.StrikePrice value = new org.quickfix.field.StrikePrice();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.StrikePrice field)
  { return isSetField(field); }
  public boolean isSetStrikePrice()
  { return isSetField(202); }
  public void set(org.quickfix.field.OptAttribute value)
  { setField(value); }
  public org.quickfix.field.OptAttribute get(org.quickfix.field.OptAttribute  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.OptAttribute getOptAttribute() throws FieldNotFound
  { org.quickfix.field.OptAttribute value = new org.quickfix.field.OptAttribute();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.OptAttribute field)
  { return isSetField(field); }
  public boolean isSetOptAttribute()
  { return isSetField(206); }
  public void set(org.quickfix.field.ContractMultiplier value)
  { setField(value); }
  public org.quickfix.field.ContractMultiplier get(org.quickfix.field.ContractMultiplier  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.ContractMultiplier getContractMultiplier() throws FieldNotFound
  { org.quickfix.field.ContractMultiplier value = new org.quickfix.field.ContractMultiplier();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.ContractMultiplier field)
  { return isSetField(field); }
  public boolean isSetContractMultiplier()
  { return isSetField(231); }
  public void set(org.quickfix.field.CouponRate value)
  { setField(value); }
  public org.quickfix.field.CouponRate get(org.quickfix.field.CouponRate  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.CouponRate getCouponRate() throws FieldNotFound
  { org.quickfix.field.CouponRate value = new org.quickfix.field.CouponRate();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.CouponRate field)
  { return isSetField(field); }
  public boolean isSetCouponRate()
  { return isSetField(223); }
  public void set(org.quickfix.field.SecurityExchange value)
  { setField(value); }
  public org.quickfix.field.SecurityExchange get(org.quickfix.field.SecurityExchange  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.SecurityExchange getSecurityExchange() throws FieldNotFound
  { org.quickfix.field.SecurityExchange value = new org.quickfix.field.SecurityExchange();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.SecurityExchange field)
  { return isSetField(field); }
  public boolean isSetSecurityExchange()
  { return isSetField(207); }
  public void set(org.quickfix.field.Issuer value)
  { setField(value); }
  public org.quickfix.field.Issuer get(org.quickfix.field.Issuer  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.Issuer getIssuer() throws FieldNotFound
  { org.quickfix.field.Issuer value = new org.quickfix.field.Issuer();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.Issuer field)
  { return isSetField(field); }
  public boolean isSetIssuer()
  { return isSetField(106); }
  public void set(org.quickfix.field.EncodedIssuerLen value)
  { setField(value); }
  public org.quickfix.field.EncodedIssuerLen get(org.quickfix.field.EncodedIssuerLen  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.EncodedIssuerLen getEncodedIssuerLen() throws FieldNotFound
  { org.quickfix.field.EncodedIssuerLen value = new org.quickfix.field.EncodedIssuerLen();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.EncodedIssuerLen field)
  { return isSetField(field); }
  public boolean isSetEncodedIssuerLen()
  { return isSetField(348); }
  public void set(org.quickfix.field.EncodedIssuer value)
  { setField(value); }
  public org.quickfix.field.EncodedIssuer get(org.quickfix.field.EncodedIssuer  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.EncodedIssuer getEncodedIssuer() throws FieldNotFound
  { org.quickfix.field.EncodedIssuer value = new org.quickfix.field.EncodedIssuer();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.EncodedIssuer field)
  { return isSetField(field); }
  public boolean isSetEncodedIssuer()
  { return isSetField(349); }
  public void set(org.quickfix.field.SecurityDesc value)
  { setField(value); }
  public org.quickfix.field.SecurityDesc get(org.quickfix.field.SecurityDesc  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.SecurityDesc getSecurityDesc() throws FieldNotFound
  { org.quickfix.field.SecurityDesc value = new org.quickfix.field.SecurityDesc();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.SecurityDesc field)
  { return isSetField(field); }
  public boolean isSetSecurityDesc()
  { return isSetField(107); }
  public void set(org.quickfix.field.EncodedSecurityDescLen value)
  { setField(value); }
  public org.quickfix.field.EncodedSecurityDescLen get(org.quickfix.field.EncodedSecurityDescLen  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.EncodedSecurityDescLen getEncodedSecurityDescLen() throws FieldNotFound
  { org.quickfix.field.EncodedSecurityDescLen value = new org.quickfix.field.EncodedSecurityDescLen();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.EncodedSecurityDescLen field)
  { return isSetField(field); }
  public boolean isSetEncodedSecurityDescLen()
  { return isSetField(350); }
  public void set(org.quickfix.field.EncodedSecurityDesc value)
  { setField(value); }
  public org.quickfix.field.EncodedSecurityDesc get(org.quickfix.field.EncodedSecurityDesc  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.EncodedSecurityDesc getEncodedSecurityDesc() throws FieldNotFound
  { org.quickfix.field.EncodedSecurityDesc value = new org.quickfix.field.EncodedSecurityDesc();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.EncodedSecurityDesc field)
  { return isSetField(field); }
  public boolean isSetEncodedSecurityDesc()
  { return isSetField(351); }
  public void set(org.quickfix.field.Currency value)
  { setField(value); }
  public org.quickfix.field.Currency get(org.quickfix.field.Currency  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.Currency getCurrency() throws FieldNotFound
  { org.quickfix.field.Currency value = new org.quickfix.field.Currency();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.Currency field)
  { return isSetField(field); }
  public boolean isSetCurrency()
  { return isSetField(15); }
  public void set(org.quickfix.field.TradingSessionID value)
  { setField(value); }
  public org.quickfix.field.TradingSessionID get(org.quickfix.field.TradingSessionID  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.TradingSessionID getTradingSessionID() throws FieldNotFound
  { org.quickfix.field.TradingSessionID value = new org.quickfix.field.TradingSessionID();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.TradingSessionID field)
  { return isSetField(field); }
  public boolean isSetTradingSessionID()
  { return isSetField(336); }
  public void set(org.quickfix.field.Text value)
  { setField(value); }
  public org.quickfix.field.Text get(org.quickfix.field.Text  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.Text getText() throws FieldNotFound
  { org.quickfix.field.Text value = new org.quickfix.field.Text();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.Text field)
  { return isSetField(field); }
  public boolean isSetText()
  { return isSetField(58); }
  public void set(org.quickfix.field.EncodedTextLen value)
  { setField(value); }
  public org.quickfix.field.EncodedTextLen get(org.quickfix.field.EncodedTextLen  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.EncodedTextLen getEncodedTextLen() throws FieldNotFound
  { org.quickfix.field.EncodedTextLen value = new org.quickfix.field.EncodedTextLen();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.EncodedTextLen field)
  { return isSetField(field); }
  public boolean isSetEncodedTextLen()
  { return isSetField(354); }
  public void set(org.quickfix.field.EncodedText value)
  { setField(value); }
  public org.quickfix.field.EncodedText get(org.quickfix.field.EncodedText  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.EncodedText getEncodedText() throws FieldNotFound
  { org.quickfix.field.EncodedText value = new org.quickfix.field.EncodedText();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.EncodedText field)
  { return isSetField(field); }
  public boolean isSetEncodedText()
  { return isSetField(355); }
  public void set(org.quickfix.field.NoRelatedSym value)
  { setField(value); }
  public org.quickfix.field.NoRelatedSym get(org.quickfix.field.NoRelatedSym  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.NoRelatedSym getNoRelatedSym() throws FieldNotFound
  { org.quickfix.field.NoRelatedSym value = new org.quickfix.field.NoRelatedSym();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.NoRelatedSym field)
  { return isSetField(field); }
  public boolean isSetNoRelatedSym()
  { return isSetField(146); }
  public static class NoRelatedSym extends Group {
    public NoRelatedSym() {
      super(146,311,
      new int[] {311,312,309,305,310,313,314,315,316,317,436,435,308,306,362,363,307,364,365,319,54,318,0 } ); }
  public void set(org.quickfix.field.UnderlyingSymbol value)
  { setField(value); }
  public org.quickfix.field.UnderlyingSymbol get(org.quickfix.field.UnderlyingSymbol  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.UnderlyingSymbol getUnderlyingSymbol() throws FieldNotFound
  { org.quickfix.field.UnderlyingSymbol value = new org.quickfix.field.UnderlyingSymbol();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.UnderlyingSymbol field)
  { return isSetField(field); }
  public boolean isSetUnderlyingSymbol()
  { return isSetField(311); }
  public void set(org.quickfix.field.UnderlyingSymbolSfx value)
  { setField(value); }
  public org.quickfix.field.UnderlyingSymbolSfx get(org.quickfix.field.UnderlyingSymbolSfx  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.UnderlyingSymbolSfx getUnderlyingSymbolSfx() throws FieldNotFound
  { org.quickfix.field.UnderlyingSymbolSfx value = new org.quickfix.field.UnderlyingSymbolSfx();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.UnderlyingSymbolSfx field)
  { return isSetField(field); }
  public boolean isSetUnderlyingSymbolSfx()
  { return isSetField(312); }
  public void set(org.quickfix.field.UnderlyingSecurityID value)
  { setField(value); }
  public org.quickfix.field.UnderlyingSecurityID get(org.quickfix.field.UnderlyingSecurityID  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.UnderlyingSecurityID getUnderlyingSecurityID() throws FieldNotFound
  { org.quickfix.field.UnderlyingSecurityID value = new org.quickfix.field.UnderlyingSecurityID();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.UnderlyingSecurityID field)
  { return isSetField(field); }
  public boolean isSetUnderlyingSecurityID()
  { return isSetField(309); }
  public void set(org.quickfix.field.UnderlyingIDSource value)
  { setField(value); }
  public org.quickfix.field.UnderlyingIDSource get(org.quickfix.field.UnderlyingIDSource  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.UnderlyingIDSource getUnderlyingIDSource() throws FieldNotFound
  { org.quickfix.field.UnderlyingIDSource value = new org.quickfix.field.UnderlyingIDSource();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.UnderlyingIDSource field)
  { return isSetField(field); }
  public boolean isSetUnderlyingIDSource()
  { return isSetField(305); }
  public void set(org.quickfix.field.UnderlyingSecurityType value)
  { setField(value); }
  public org.quickfix.field.UnderlyingSecurityType get(org.quickfix.field.UnderlyingSecurityType  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.UnderlyingSecurityType getUnderlyingSecurityType() throws FieldNotFound
  { org.quickfix.field.UnderlyingSecurityType value = new org.quickfix.field.UnderlyingSecurityType();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.UnderlyingSecurityType field)
  { return isSetField(field); }
  public boolean isSetUnderlyingSecurityType()
  { return isSetField(310); }
  public void set(org.quickfix.field.UnderlyingMaturityMonthYear value)
  { setField(value); }
  public org.quickfix.field.UnderlyingMaturityMonthYear get(org.quickfix.field.UnderlyingMaturityMonthYear  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.UnderlyingMaturityMonthYear getUnderlyingMaturityMonthYear() throws FieldNotFound
  { org.quickfix.field.UnderlyingMaturityMonthYear value = new org.quickfix.field.UnderlyingMaturityMonthYear();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.UnderlyingMaturityMonthYear field)
  { return isSetField(field); }
  public boolean isSetUnderlyingMaturityMonthYear()
  { return isSetField(313); }
  public void set(org.quickfix.field.UnderlyingMaturityDay value)
  { setField(value); }
  public org.quickfix.field.UnderlyingMaturityDay get(org.quickfix.field.UnderlyingMaturityDay  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.UnderlyingMaturityDay getUnderlyingMaturityDay() throws FieldNotFound
  { org.quickfix.field.UnderlyingMaturityDay value = new org.quickfix.field.UnderlyingMaturityDay();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.UnderlyingMaturityDay field)
  { return isSetField(field); }
  public boolean isSetUnderlyingMaturityDay()
  { return isSetField(314); }
  public void set(org.quickfix.field.UnderlyingPutOrCall value)
  { setField(value); }
  public org.quickfix.field.UnderlyingPutOrCall get(org.quickfix.field.UnderlyingPutOrCall  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.UnderlyingPutOrCall getUnderlyingPutOrCall() throws FieldNotFound
  { org.quickfix.field.UnderlyingPutOrCall value = new org.quickfix.field.UnderlyingPutOrCall();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.UnderlyingPutOrCall field)
  { return isSetField(field); }
  public boolean isSetUnderlyingPutOrCall()
  { return isSetField(315); }
  public void set(org.quickfix.field.UnderlyingStrikePrice value)
  { setField(value); }
  public org.quickfix.field.UnderlyingStrikePrice get(org.quickfix.field.UnderlyingStrikePrice  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.UnderlyingStrikePrice getUnderlyingStrikePrice() throws FieldNotFound
  { org.quickfix.field.UnderlyingStrikePrice value = new org.quickfix.field.UnderlyingStrikePrice();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.UnderlyingStrikePrice field)
  { return isSetField(field); }
  public boolean isSetUnderlyingStrikePrice()
  { return isSetField(316); }
  public void set(org.quickfix.field.UnderlyingOptAttribute value)
  { setField(value); }
  public org.quickfix.field.UnderlyingOptAttribute get(org.quickfix.field.UnderlyingOptAttribute  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.UnderlyingOptAttribute getUnderlyingOptAttribute() throws FieldNotFound
  { org.quickfix.field.UnderlyingOptAttribute value = new org.quickfix.field.UnderlyingOptAttribute();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.UnderlyingOptAttribute field)
  { return isSetField(field); }
  public boolean isSetUnderlyingOptAttribute()
  { return isSetField(317); }
  public void set(org.quickfix.field.UnderlyingContractMultiplier value)
  { setField(value); }
  public org.quickfix.field.UnderlyingContractMultiplier get(org.quickfix.field.UnderlyingContractMultiplier  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.UnderlyingContractMultiplier getUnderlyingContractMultiplier() throws FieldNotFound
  { org.quickfix.field.UnderlyingContractMultiplier value = new org.quickfix.field.UnderlyingContractMultiplier();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.UnderlyingContractMultiplier field)
  { return isSetField(field); }
  public boolean isSetUnderlyingContractMultiplier()
  { return isSetField(436); }
  public void set(org.quickfix.field.UnderlyingCouponRate value)
  { setField(value); }
  public org.quickfix.field.UnderlyingCouponRate get(org.quickfix.field.UnderlyingCouponRate  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.UnderlyingCouponRate getUnderlyingCouponRate() throws FieldNotFound
  { org.quickfix.field.UnderlyingCouponRate value = new org.quickfix.field.UnderlyingCouponRate();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.UnderlyingCouponRate field)
  { return isSetField(field); }
  public boolean isSetUnderlyingCouponRate()
  { return isSetField(435); }
  public void set(org.quickfix.field.UnderlyingSecurityExchange value)
  { setField(value); }
  public org.quickfix.field.UnderlyingSecurityExchange get(org.quickfix.field.UnderlyingSecurityExchange  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.UnderlyingSecurityExchange getUnderlyingSecurityExchange() throws FieldNotFound
  { org.quickfix.field.UnderlyingSecurityExchange value = new org.quickfix.field.UnderlyingSecurityExchange();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.UnderlyingSecurityExchange field)
  { return isSetField(field); }
  public boolean isSetUnderlyingSecurityExchange()
  { return isSetField(308); }
  public void set(org.quickfix.field.UnderlyingIssuer value)
  { setField(value); }
  public org.quickfix.field.UnderlyingIssuer get(org.quickfix.field.UnderlyingIssuer  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.UnderlyingIssuer getUnderlyingIssuer() throws FieldNotFound
  { org.quickfix.field.UnderlyingIssuer value = new org.quickfix.field.UnderlyingIssuer();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.UnderlyingIssuer field)
  { return isSetField(field); }
  public boolean isSetUnderlyingIssuer()
  { return isSetField(306); }
  public void set(org.quickfix.field.EncodedUnderlyingIssuerLen value)
  { setField(value); }
  public org.quickfix.field.EncodedUnderlyingIssuerLen get(org.quickfix.field.EncodedUnderlyingIssuerLen  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.EncodedUnderlyingIssuerLen getEncodedUnderlyingIssuerLen() throws FieldNotFound
  { org.quickfix.field.EncodedUnderlyingIssuerLen value = new org.quickfix.field.EncodedUnderlyingIssuerLen();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.EncodedUnderlyingIssuerLen field)
  { return isSetField(field); }
  public boolean isSetEncodedUnderlyingIssuerLen()
  { return isSetField(362); }
  public void set(org.quickfix.field.EncodedUnderlyingIssuer value)
  { setField(value); }
  public org.quickfix.field.EncodedUnderlyingIssuer get(org.quickfix.field.EncodedUnderlyingIssuer  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.EncodedUnderlyingIssuer getEncodedUnderlyingIssuer() throws FieldNotFound
  { org.quickfix.field.EncodedUnderlyingIssuer value = new org.quickfix.field.EncodedUnderlyingIssuer();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.EncodedUnderlyingIssuer field)
  { return isSetField(field); }
  public boolean isSetEncodedUnderlyingIssuer()
  { return isSetField(363); }
  public void set(org.quickfix.field.UnderlyingSecurityDesc value)
  { setField(value); }
  public org.quickfix.field.UnderlyingSecurityDesc get(org.quickfix.field.UnderlyingSecurityDesc  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.UnderlyingSecurityDesc getUnderlyingSecurityDesc() throws FieldNotFound
  { org.quickfix.field.UnderlyingSecurityDesc value = new org.quickfix.field.UnderlyingSecurityDesc();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.UnderlyingSecurityDesc field)
  { return isSetField(field); }
  public boolean isSetUnderlyingSecurityDesc()
  { return isSetField(307); }
  public void set(org.quickfix.field.EncodedUnderlyingSecurityDescLen value)
  { setField(value); }
  public org.quickfix.field.EncodedUnderlyingSecurityDescLen get(org.quickfix.field.EncodedUnderlyingSecurityDescLen  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.EncodedUnderlyingSecurityDescLen getEncodedUnderlyingSecurityDescLen() throws FieldNotFound
  { org.quickfix.field.EncodedUnderlyingSecurityDescLen value = new org.quickfix.field.EncodedUnderlyingSecurityDescLen();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.EncodedUnderlyingSecurityDescLen field)
  { return isSetField(field); }
  public boolean isSetEncodedUnderlyingSecurityDescLen()
  { return isSetField(364); }
  public void set(org.quickfix.field.EncodedUnderlyingSecurityDesc value)
  { setField(value); }
  public org.quickfix.field.EncodedUnderlyingSecurityDesc get(org.quickfix.field.EncodedUnderlyingSecurityDesc  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.EncodedUnderlyingSecurityDesc getEncodedUnderlyingSecurityDesc() throws FieldNotFound
  { org.quickfix.field.EncodedUnderlyingSecurityDesc value = new org.quickfix.field.EncodedUnderlyingSecurityDesc();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.EncodedUnderlyingSecurityDesc field)
  { return isSetField(field); }
  public boolean isSetEncodedUnderlyingSecurityDesc()
  { return isSetField(365); }
  public void set(org.quickfix.field.RatioQty value)
  { setField(value); }
  public org.quickfix.field.RatioQty get(org.quickfix.field.RatioQty  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.RatioQty getRatioQty() throws FieldNotFound
  { org.quickfix.field.RatioQty value = new org.quickfix.field.RatioQty();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.RatioQty field)
  { return isSetField(field); }
  public boolean isSetRatioQty()
  { return isSetField(319); }
  public void set(org.quickfix.field.Side value)
  { setField(value); }
  public org.quickfix.field.Side get(org.quickfix.field.Side  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.Side getSide() throws FieldNotFound
  { org.quickfix.field.Side value = new org.quickfix.field.Side();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.Side field)
  { return isSetField(field); }
  public boolean isSetSide()
  { return isSetField(54); }
  public void set(org.quickfix.field.UnderlyingCurrency value)
  { setField(value); }
  public org.quickfix.field.UnderlyingCurrency get(org.quickfix.field.UnderlyingCurrency  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.UnderlyingCurrency getUnderlyingCurrency() throws FieldNotFound
  { org.quickfix.field.UnderlyingCurrency value = new org.quickfix.field.UnderlyingCurrency();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.UnderlyingCurrency field)
  { return isSetField(field); }
  public boolean isSetUnderlyingCurrency()
  { return isSetField(318); }
}
}
