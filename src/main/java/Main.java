import parser.JsonParser;
import clients.Client;

class Main {
    public static void main(String args[]) throws Exception {
        var parser = new JsonParser(args[0]);
        var client = Client.build(parser.getJson());
        client.introduce();
    }
}
