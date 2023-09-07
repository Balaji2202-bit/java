public class Mobile1
{
    public static void main(String[] args)
    {
        Mobile1 whatsapp=new Mobile1()
        {
            public void take_photo()
            {
                System.out.println("now whatsapp uses your camera" );
            }
        };
        Mobile1 snapchat =new Mobile1()
        {
          public void take_photo()
          {
              System.out.println("Now snap uses your camera: ");
          }
        };
    }
}
