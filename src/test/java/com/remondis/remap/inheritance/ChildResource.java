package com.remondis.remap.inheritance;

import com.remondis.remap.basic.BResource;

public class ChildResource extends ParentResource {

  private Object object;
  private int zahl;

  public ChildResource() {
    super();
  }

  public ChildResource(Object shouldNotMap, String string, BResource field, Object object, int zahl) {
    super(shouldNotMap, string, field);
    this.object = object;
    this.zahl = zahl;
  }

  /**
   * @return the object
   */
  public Object getObject() {
    return object;
  }

  /**
   * @param object
   *        the object to set
   */
  public void setObject(Object object) {
    this.object = object;
  }

  /**
   * @return the zahl
   */
  public int getZahl() {
    return zahl;
  }

  /**
   * @param zahl
   *        the zahl to set
   */
  public void setZahl(int zahl) {
    this.zahl = zahl;
  }

  /*
   * (non-Javadoc)
   *
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "ChildResource [object=" + object + ", zahl=" + zahl + "]";
  }

}
