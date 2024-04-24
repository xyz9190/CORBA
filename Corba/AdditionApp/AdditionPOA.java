package AdditionApp;


/**
* AdditionApp/AdditionPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Addition.idl
* Wednesday, 24 April, 2024 3:21:29 PM IST
*/

public abstract class AdditionPOA extends org.omg.PortableServer.Servant
 implements AdditionApp.AdditionOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("add", new java.lang.Integer (0));
    _methods.put ("subtract", new java.lang.Integer (1));
    _methods.put ("multiply", new java.lang.Integer (2));
    _methods.put ("divide", new java.lang.Integer (3));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // AdditionApp/Addition/add
       {
         double a = in.read_double ();
         double b = in.read_double ();
         double $result = (double)0;
         $result = this.add (a, b);
         out = $rh.createReply();
         out.write_double ($result);
         break;
       }

       case 1:  // AdditionApp/Addition/subtract
       {
         double a = in.read_double ();
         double b = in.read_double ();
         double $result = (double)0;
         $result = this.subtract (a, b);
         out = $rh.createReply();
         out.write_double ($result);
         break;
       }

       case 2:  // AdditionApp/Addition/multiply
       {
         double a = in.read_double ();
         double b = in.read_double ();
         double $result = (double)0;
         $result = this.multiply (a, b);
         out = $rh.createReply();
         out.write_double ($result);
         break;
       }

       case 3:  // AdditionApp/Addition/divide
       {
         double a = in.read_double ();
         double b = in.read_double ();
         double $result = (double)0;
         $result = this.divide (a, b);
         out = $rh.createReply();
         out.write_double ($result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:AdditionApp/Addition:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Addition _this() 
  {
    return AdditionHelper.narrow(
    super._this_object());
  }

  public Addition _this(org.omg.CORBA.ORB orb) 
  {
    return AdditionHelper.narrow(
    super._this_object(orb));
  }


} // class AdditionPOA
