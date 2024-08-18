package devs.fmm.exceptionhandling.catchingexceptions;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class IdentifyExceptions {

    public static void main(String[] args) {
        try{
            Clip clip = AudioSystem.getClip();
            String[] paths = new String[3];
            paths[0]="/home/user/Documentos/DevProjects/Java/Java Programming Exercises/Recursos/Funny_Boy_Laugh-Mike_Koenig-1446565974.wav";
            paths[1]="/home/user/Documentos/DevProjects/Java/Java Programming Exercises/Recursos/Joke Sting-SoundBible.com-1968971319.wav";
            paths[2]="/home/user/Documentos/DevProjects/Java/Java Programming Exercises/Recursos/Light Rain And Crickets-SoundBible.com-1664737469.wav";
            Random random = new Random();
            Scanner sc = new Scanner(System.in);
            do{

                clip.open(AudioSystem.getAudioInputStream(new File(paths[random.nextInt(3)])));
                clip.start();
                TimeUnit.MICROSECONDS.sleep(clip.getMicrosecondLength()+50);
                clip.close();
                System.out.println("Para terminar pulse x, para continuar cualquier otra tecla");
            } while (!sc.nextLine().equals("x"));

        } catch(LineUnavailableException e)
        {
            System.out.println(e);

        } catch (UnsupportedAudioFileException e)
        {
            System.out.println(e);

        } catch (IOException e){

            System.out.println(e);
        } catch (InterruptedException e){

            System.out.println(e);
        }
    }



}
