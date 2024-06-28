import java.util.Scanner;

public class iPhone {
    private MusicPlayer musicPlayer;
    private PhoneDevice phoneDevice;
    private WebBrowser webBrowser;

    public iPhone() {
        musicPlayer = new MusicPlayer();
        phoneDevice = new PhoneDevice();
        webBrowser = new WebBrowser();
    }

    public void run() {
    Scanner scanner = new Scanner(System.in);

    while (true) {
        System.out.println("Select what to do with your iPhone:");
        System.out.println("1. Phone");
        System.out.println("2. Music Player");
        System.out.println("3. Web Browser");
        System.out.println("4. Turn off iPhone");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        switch (choice) {
            case 1:
                handlePhoneOptions(scanner);
                break;
            case 2:
                handleMusicPlayerOptions(scanner);
                break;
            case 3:
                handleWebBrowserOptions(scanner);
                break;
            case 4:
                turnOffIPhone();
                return;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }

        System.out.println();
    }
}

private void handlePhoneOptions(Scanner scanner) {
    while (true) {
        System.out.println("Phone options:");
        System.out.println("1. Make a call");
        System.out.println("2. Answer a call");
        System.out.println("3. Start voicemail");
        System.out.println("4. Go back");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        switch (choice) {
            case 1:
                System.out.print("Enter the phone number: ");
                String number = scanner.nextLine();
                phoneDevice.makeCall(number);
                break;
            case 2:
                phoneDevice.answerCall();
                System.out.println("Call answered");
                break;
            case 3:
                phoneDevice.startVoicemail();
                System.out.println("Voicemail started");
                break;
            case 4:
                return;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }

        System.out.println();
    }
}

private void handleMusicPlayerOptions(Scanner scanner) {
    while (true) {
        System.out.println("Music Player options:");
        System.out.println("1. Play a song");
        System.out.println("2. Pause music");
        System.out.println("3. Select a song");
        System.out.println("4. Go back");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        switch (choice) {
            case 1:
                System.out.print("Enter the song name: ");
                String song = scanner.nextLine();
                musicPlayer.playMusic(song);
                System.out.println("Playing song: " + song + ".mp3");
                break;
            case 2:
                musicPlayer.pauseMusic();
                System.out.println("Music paused");
                break;
            case 3:                
                return;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }

        System.out.println();
    }
}

private void handleWebBrowserOptions(Scanner scanner) {
    while (true) {
        System.out.println("Web Browser options:");
        System.out.println("1. Browse a page");
        System.out.println("2. Add a new tab");
        System.out.println("3. Refresh the page");
        System.out.println("4. Go back");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        switch (choice) {
            case 1:
                System.out.print("Enter the URL: ");
                String url = scanner.nextLine();
                webBrowser.browsePage(url);
                break;
            case 2:
                webBrowser.addNewTab();
                System.out.println("New tab added");
                break;
            case 3:
                webBrowser.refreshPage();
                System.out.println("Page refreshed");
                break;
            case 4:
                return;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }

        System.out.println();
    }
}

private void turnOffIPhone() {
    System.out.println("Turning off the iPhone...");
}
}