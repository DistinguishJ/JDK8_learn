package org.omg.CosNaming;


/**
* org/omg/CosNaming/_NamingContextExtStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u202/12323/corba/src/share/classes/org/omg/CosNaming/nameservice.idl
* Saturday, December 15, 2018 7:56:49 PM PST
*/


/** 
 * <code>NamingContextExt</code> is the extension of <code>NamingContext</code>
 * which
 * contains a set of name bindings in which each name is unique and is
 * part of Interoperable Naming Service.
 * Different names can be bound to an object in the same or different
 * contexts at the same time. Using <tt>NamingContextExt</tt>, you can use
 * URL-based names to bind and resolve. <p>
 * 
 * See <a href="http://www.omg.org/technology/documents/formal/naming_service.htm">
 * CORBA COS 
 * Naming Specification.</a>
 */
public class _NamingContextExtStub extends org.omg.CORBA.portable.ObjectImpl implements org.omg.CosNaming.NamingContextExt
{


  /**
 * This operation creates a stringified name from the array of Name
 * components.
 * 
 * @param n Name of the object <p>
 * 
 * @exception org.omg.CosNaming.NamingContextExtPackage.InvalidName
 * Indicates the name does not identify a binding.<p>
 * 
 */
  public String to_string (org.omg.CosNaming.NameComponent[] n) throws org.omg.CosNaming.NamingContextPackage.InvalidName
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("to_string", true);
                org.omg.CosNaming.NameHelper.write ($out, n);
                $in = _invoke ($out);
                String $result = org.omg.CosNaming.NamingContextExtPackage.StringNameHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNaming/NamingContext/InvalidName:1.0"))
                    throw org.omg.CosNaming.NamingContextPackage.InvalidNameHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return to_string (n        );
            } finally {
                _releaseReply ($in);
            }
  } // to_string


  /**
 * This operation  converts a Stringified Name into an  equivalent array
 * of Name Components. 
 * 
 * @param sn Stringified Name of the object <p>
 * 
 * @exception org.omg.CosNaming.NamingContextExtPackage.InvalidName
 * Indicates the name does not identify a binding.<p>
 * 
 */
  public org.omg.CosNaming.NameComponent[] to_name (String sn) throws org.omg.CosNaming.NamingContextPackage.InvalidName
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("to_name", true);
                org.omg.CosNaming.NamingContextExtPackage.StringNameHelper.write ($out, sn);
                $in = _invoke ($out);
                org.omg.CosNaming.NameComponent $result[] = org.omg.CosNaming.NameHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNaming/NamingContext/InvalidName:1.0"))
                    throw org.omg.CosNaming.NamingContextPackage.InvalidNameHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return to_name (sn        );
            } finally {
                _releaseReply ($in);
            }
  } // to_name


  /**
 * This operation creates a URL based "iiopname://" format name
 * from the Stringified Name of the object.
 * 
 * @param addr internet based address of the host machine where  Name Service is running <p>
 * @param sn Stringified Name of the object <p>
 * 
 * @exception org.omg.CosNaming.NamingContextExtPackage.InvalidName
 * Indicates the name does not identify a binding.<p>
 * @exception org.omg.CosNaming.NamingContextPackage.InvalidAddress
 * Indicates the internet based address of the host machine is 
 * incorrect <p>
 * 
 */
  public String to_url (String addr, String sn) throws org.omg.CosNaming.NamingContextExtPackage.InvalidAddress, org.omg.CosNaming.NamingContextPackage.InvalidName
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("to_url", true);
                org.omg.CosNaming.NamingContextExtPackage.AddressHelper.write ($out, addr);
                org.omg.CosNaming.NamingContextExtPackage.StringNameHelper.write ($out, sn);
                $in = _invoke ($out);
                String $result = org.omg.CosNaming.NamingContextExtPackage.URLStringHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNaming/NamingContextExt/InvalidAddress:1.0"))
                    throw org.omg.CosNaming.NamingContextExtPackage.InvalidAddressHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/CosNaming/NamingContext/InvalidName:1.0"))
                    throw org.omg.CosNaming.NamingContextPackage.InvalidNameHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return to_url (addr, sn        );
            } finally {
                _releaseReply ($in);
            }
  } // to_url


  /**
 * This operation resolves the Stringified name into the object
 * reference. 
 * 
 * @param sn Stringified Name of the object <p>
 * 
 * @exception org.omg.CosNaming.NamingContextPackage.NotFound
 * Indicates there is no object reference for the given name. <p>
 * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed
 * Indicates that the given compound name is incorrect <p>
 * @exception org.omg.CosNaming.NamingContextExtPackage.InvalidName
 * Indicates the name does not identify a binding.<p>
 * 
 */
  public org.omg.CORBA.Object resolve_str (String sn) throws org.omg.CosNaming.NamingContextPackage.NotFound, org.omg.CosNaming.NamingContextPackage.CannotProceed, org.omg.CosNaming.NamingContextPackage.InvalidName
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("resolve_str", true);
                org.omg.CosNaming.NamingContextExtPackage.StringNameHelper.write ($out, sn);
                $in = _invoke ($out);
                org.omg.CORBA.Object $result = org.omg.CORBA.ObjectHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNaming/NamingContext/NotFound:1.0"))
                    throw org.omg.CosNaming.NamingContextPackage.NotFoundHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/CosNaming/NamingContext/CannotProceed:1.0"))
                    throw org.omg.CosNaming.NamingContextPackage.CannotProceedHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/CosNaming/NamingContext/InvalidName:1.0"))
                    throw org.omg.CosNaming.NamingContextPackage.InvalidNameHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return resolve_str (sn        );
            } finally {
                _releaseReply ($in);
            }
  } // resolve_str


  /**
 * Creates a binding of a name and an object in the naming context.
 * Naming contexts that are bound using bind do not participate in name
 * resolution when compound names are passed to be resolved. 
 * 
 * @param n Name of the object <p>
 * 
 * @param obj The Object to bind with the given name<p>
 * 
 * @exception org.omg.CosNaming.NamingContextPackage.NotFound Indicates
 * the name does not identify a binding.<p>
 * 
 * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed 
 * Indicates that the implementation has given up for some reason.
 * The client, however, may be able to continue the operation
 * at the returned naming context.<p>
 * 
 * @exception org.omg.CosNaming.NamingContextPackage.InvalidName 
 * Indicates that the name is invalid. <p>
 *
 * @exception org.omg.CosNaming.NamingContextPackage.AlreadyBound 
 * Indicates an object is already bound to the specified name.<p> 
 */
  public void bind (org.omg.CosNaming.NameComponent[] n, org.omg.CORBA.Object obj) throws org.omg.CosNaming.NamingContextPackage.NotFound, org.omg.CosNaming.NamingContextPackage.CannotProceed, org.omg.CosNaming.NamingContextPackage.InvalidName, org.omg.CosNaming.NamingContextPackage.AlreadyBound
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("bind", true);
                org.omg.CosNaming.NameHelper.write ($out, n);
                org.omg.CORBA.ObjectHelper.write ($out, obj);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNaming/NamingContext/NotFound:1.0"))
                    throw org.omg.CosNaming.NamingContextPackage.NotFoundHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/CosNaming/NamingContext/CannotProceed:1.0"))
                    throw org.omg.CosNaming.NamingContextPackage.CannotProceedHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/CosNaming/NamingContext/InvalidName:1.0"))
                    throw org.omg.CosNaming.NamingContextPackage.InvalidNameHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/CosNaming/NamingContext/AlreadyBound:1.0"))
                    throw org.omg.CosNaming.NamingContextPackage.AlreadyBoundHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                bind (n, obj        );
            } finally {
                _releaseReply ($in);
            }
  } // bind


  /**
 * Names an object that is a naming context. Naming contexts that
 * are bound using bind_context() participate in name resolution 
 * when compound names are passed to be resolved.
 * 
 * @param n Name of the object <p>
 * 
 * @param nc NamingContect object to bind with the given name <p>
 * 
 * @exception org.omg.CosNaming.NamingContextPackage.NotFound Indicates the name does not identify a binding.<p>
 * 
 * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed Indicates that the implementation has
 * given up for some reason. The client, however, may be able to 
 * continue the operation at the returned naming context.<p>
 * 
 * @exception org.omg.CosNaming.NamingContextPackage.InvalidName Indicates that the name is invalid. <p>
 *
 * @exception org.omg.CosNaming.NamingContextPackage.AlreadyBound Indicates an object is already 
 * bound to the specified name.<p>
 */
  public void bind_context (org.omg.CosNaming.NameComponent[] n, org.omg.CosNaming.NamingContext nc) throws org.omg.CosNaming.NamingContextPackage.NotFound, org.omg.CosNaming.NamingContextPackage.CannotProceed, org.omg.CosNaming.NamingContextPackage.InvalidName, org.omg.CosNaming.NamingContextPackage.AlreadyBound
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("bind_context", true);
                org.omg.CosNaming.NameHelper.write ($out, n);
                org.omg.CosNaming.NamingContextHelper.write ($out, nc);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNaming/NamingContext/NotFound:1.0"))
                    throw org.omg.CosNaming.NamingContextPackage.NotFoundHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/CosNaming/NamingContext/CannotProceed:1.0"))
                    throw org.omg.CosNaming.NamingContextPackage.CannotProceedHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/CosNaming/NamingContext/InvalidName:1.0"))
                    throw org.omg.CosNaming.NamingContextPackage.InvalidNameHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/CosNaming/NamingContext/AlreadyBound:1.0"))
                    throw org.omg.CosNaming.NamingContextPackage.AlreadyBoundHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                bind_context (n, nc        );
            } finally {
                _releaseReply ($in);
            }
  } // bind_context


  /**
 * Creates a binding of a name and an object in the naming context
 * even if the name is already bound in the context. Naming contexts 
 * that are bound using rebind do not participate in name resolution 
 * when compound names are passed to be resolved.
 * 
 * @param  n Name of the object <p>
 * 
 * @param obj The Object to rebind with the given name <p>
 * 
 * @exception org.omg.CosNaming.NamingContextPackage.NotFound Indicates the name does not identify a binding.<p>
 * 
 * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed Indicates that the implementation has
 * given up for some reason. The client, however, may be able to 
 * continue the operation at the returned naming context.<p>
 * 
 * @exception org.omg.CosNaming.NamingContextPackage.InvalidName Indicates that the name is invalid. <p>
 */
  public void rebind (org.omg.CosNaming.NameComponent[] n, org.omg.CORBA.Object obj) throws org.omg.CosNaming.NamingContextPackage.NotFound, org.omg.CosNaming.NamingContextPackage.CannotProceed, org.omg.CosNaming.NamingContextPackage.InvalidName
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("rebind", true);
                org.omg.CosNaming.NameHelper.write ($out, n);
                org.omg.CORBA.ObjectHelper.write ($out, obj);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNaming/NamingContext/NotFound:1.0"))
                    throw org.omg.CosNaming.NamingContextPackage.NotFoundHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/CosNaming/NamingContext/CannotProceed:1.0"))
                    throw org.omg.CosNaming.NamingContextPackage.CannotProceedHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/CosNaming/NamingContext/InvalidName:1.0"))
                    throw org.omg.CosNaming.NamingContextPackage.InvalidNameHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                rebind (n, obj        );
            } finally {
                _releaseReply ($in);
            }
  } // rebind


  /** 
 * Creates a binding of a name and a naming context in the naming
 * context even if the name is already bound in the context. Naming 
 * contexts that are bound using rebind_context() participate in name 
 * resolution when compound names are passed to be resolved.
 * 
 * @param n Name of the object <p>
 * 
 * @param nc NamingContect object to rebind with the given name <p>
 * 
 * @exception org.omg.CosNaming.NamingContextPackage.NotFound Indicates the name does not identify a binding.<p>
 * 
 * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed Indicates that the implementation has
 * given up for some reason. The client, however, may be able to 
 * continue the operation at the returned naming context.<p>
 * 
 * @exception org.omg.CosNaming.NamingContextPackage.InvalidName Indicates that the name is invalid. <p>
 */
  public void rebind_context (org.omg.CosNaming.NameComponent[] n, org.omg.CosNaming.NamingContext nc) throws org.omg.CosNaming.NamingContextPackage.NotFound, org.omg.CosNaming.NamingContextPackage.CannotProceed, org.omg.CosNaming.NamingContextPackage.InvalidName
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("rebind_context", true);
                org.omg.CosNaming.NameHelper.write ($out, n);
                org.omg.CosNaming.NamingContextHelper.write ($out, nc);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNaming/NamingContext/NotFound:1.0"))
                    throw org.omg.CosNaming.NamingContextPackage.NotFoundHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/CosNaming/NamingContext/CannotProceed:1.0"))
                    throw org.omg.CosNaming.NamingContextPackage.CannotProceedHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/CosNaming/NamingContext/InvalidName:1.0"))
                    throw org.omg.CosNaming.NamingContextPackage.InvalidNameHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                rebind_context (n, nc        );
            } finally {
                _releaseReply ($in);
            }
  } // rebind_context


  /** 
 * The resolve operation is the process of retrieving an object
 * bound to a name in a given context. The given name must exactly 
 * match the bound name. The naming service does not return the type 
 * of the object. Clients are responsible for "narrowing" the object 
 * to the appropriate type. That is, clients typically cast the returned 
 * object from Object to a more specialized interface.
 * 
 * @param n Name of the object <p>
 * 
 * @exception org.omg.CosNaming.NamingContextPackage.NotFound Indicates the name does not identify a binding.<p>
 * 
 * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed Indicates that the implementation has
 * given up for some reason. The client, however, may be able to 
 * continue the operation at the returned naming context.<p>
 * 
 * @exception org.omg.CosNaming.NamingContextPackage.InvalidName Indicates that the name is invalid. <p>
 */
  public org.omg.CORBA.Object resolve (org.omg.CosNaming.NameComponent[] n) throws org.omg.CosNaming.NamingContextPackage.NotFound, org.omg.CosNaming.NamingContextPackage.CannotProceed, org.omg.CosNaming.NamingContextPackage.InvalidName
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("resolve", true);
                org.omg.CosNaming.NameHelper.write ($out, n);
                $in = _invoke ($out);
                org.omg.CORBA.Object $result = org.omg.CORBA.ObjectHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNaming/NamingContext/NotFound:1.0"))
                    throw org.omg.CosNaming.NamingContextPackage.NotFoundHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/CosNaming/NamingContext/CannotProceed:1.0"))
                    throw org.omg.CosNaming.NamingContextPackage.CannotProceedHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/CosNaming/NamingContext/InvalidName:1.0"))
                    throw org.omg.CosNaming.NamingContextPackage.InvalidNameHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return resolve (n        );
            } finally {
                _releaseReply ($in);
            }
  } // resolve


  /** 
 * The unbind operation removes a name binding from a context.
 * 
 * @param n Name of the object <p>
 * 
 * @exception org.omg.CosNaming.NamingContextPackage.NotFound Indicates the name does not identify a binding.<p>
 * 
 * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed Indicates that the implementation has
 * given up for some reason. The client, however, may be able to 
 * continue the operation at the returned naming context.<p>
 * 
 * @exception org.omg.CosNaming.NamingContextPackage.InvalidName Indicates that the name is invalid. <p>
 */
  public void unbind (org.omg.CosNaming.NameComponent[] n) throws org.omg.CosNaming.NamingContextPackage.NotFound, org.omg.CosNaming.NamingContextPackage.CannotProceed, org.omg.CosNaming.NamingContextPackage.InvalidName
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("unbind", true);
                org.omg.CosNaming.NameHelper.write ($out, n);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNaming/NamingContext/NotFound:1.0"))
                    throw org.omg.CosNaming.NamingContextPackage.NotFoundHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/CosNaming/NamingContext/CannotProceed:1.0"))
                    throw org.omg.CosNaming.NamingContextPackage.CannotProceedHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/CosNaming/NamingContext/InvalidName:1.0"))
                    throw org.omg.CosNaming.NamingContextPackage.InvalidNameHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                unbind (n        );
            } finally {
                _releaseReply ($in);
            }
  } // unbind


  /**
 * The list operation allows a client to iterate through a set of
 * bindings in a naming context. <p>
 * 
 * The list operation returns at most the requested number of
 * bindings in BindingList bl. 
 * <ul>
 * <li>If the naming context contains additional 
 * bindings, the list operation returns a BindingIterator with the 
 * additional bindings. 
 * <li>If the naming context does not contain additional 
 * bindings, the binding iterator is a nil object reference.
 * </ul>
 * 
 * @param how_many the maximum number of bindings to return <p>
 * 
 * @param bl the returned list of bindings <p>
 * 
 * @param bi the returned binding iterator <p>
 */
  public void list (int how_many, org.omg.CosNaming.BindingListHolder bl, org.omg.CosNaming.BindingIteratorHolder bi)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("list", true);
                $out.write_ulong (how_many);
                $in = _invoke ($out);
                bl.value = org.omg.CosNaming.BindingListHelper.read ($in);
                bi.value = org.omg.CosNaming.BindingIteratorHelper.read ($in);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                list (how_many, bl, bi        );
            } finally {
                _releaseReply ($in);
            }
  } // list


  /**
 * This operation returns a naming context implemented by the same
 * naming server as the context on which the operation was invoked. 
 * The new context is not bound to any name.
 */
  public org.omg.CosNaming.NamingContext new_context ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("new_context", true);
                $in = _invoke ($out);
                org.omg.CosNaming.NamingContext $result = org.omg.CosNaming.NamingContextHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return new_context (        );
            } finally {
                _releaseReply ($in);
            }
  } // new_context


  /**
 * This operation creates a new context and binds it to the name
 * supplied as an argument. The newly-created context is implemented 
 * by the same naming server as the context in which it was bound (that 
 * is, the naming server that implements the context denoted by the 
 * name argument excluding the last component).
 * 
 * @param n Name of the object <p>
 * 
 * @exception org.omg.CosNaming.NamingContextPackage.NotFound Indicates the name does not identify a binding.<p>
 * 
 * @exception org.omg.CosNaming.NamingContextPackage.AlreadyBound Indicates an object is already 
 * bound to the specified name.<p>
 * 
 * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed Indicates that the implementation has
 * given up for some reason. The client, however, may be able to 
 * continue the operation at the returned naming context.<p>
 * 
 * @exception org.omg.CosNaming.NamingContextPackage.InvalidName Indicates that the name is invalid. <p>
 */
  public org.omg.CosNaming.NamingContext bind_new_context (org.omg.CosNaming.NameComponent[] n) throws org.omg.CosNaming.NamingContextPackage.NotFound, org.omg.CosNaming.NamingContextPackage.AlreadyBound, org.omg.CosNaming.NamingContextPackage.CannotProceed, org.omg.CosNaming.NamingContextPackage.InvalidName
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("bind_new_context", true);
                org.omg.CosNaming.NameHelper.write ($out, n);
                $in = _invoke ($out);
                org.omg.CosNaming.NamingContext $result = org.omg.CosNaming.NamingContextHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNaming/NamingContext/NotFound:1.0"))
                    throw org.omg.CosNaming.NamingContextPackage.NotFoundHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/CosNaming/NamingContext/AlreadyBound:1.0"))
                    throw org.omg.CosNaming.NamingContextPackage.AlreadyBoundHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/CosNaming/NamingContext/CannotProceed:1.0"))
                    throw org.omg.CosNaming.NamingContextPackage.CannotProceedHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/CosNaming/NamingContext/InvalidName:1.0"))
                    throw org.omg.CosNaming.NamingContextPackage.InvalidNameHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return bind_new_context (n        );
            } finally {
                _releaseReply ($in);
            }
  } // bind_new_context


  /** 
 * The destroy operation deletes a naming context. If the naming 
 * context contains bindings, the NotEmpty exception is raised.
 * 
 * @exception org.omg.CosNaming.NamingContextPackage.NotEmpty Indicates that the Naming Context contains bindings.
 */
  public void destroy () throws org.omg.CosNaming.NamingContextPackage.NotEmpty
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("destroy", true);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNaming/NamingContext/NotEmpty:1.0"))
                    throw org.omg.CosNaming.NamingContextPackage.NotEmptyHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                destroy (        );
            } finally {
                _releaseReply ($in);
            }
  } // destroy

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:omg.org/CosNaming/NamingContextExt:1.0", 
    "IDL:omg.org/CosNaming/NamingContext:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _NamingContextExtStub
