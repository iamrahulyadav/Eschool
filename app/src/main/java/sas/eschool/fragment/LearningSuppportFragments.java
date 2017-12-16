package sas.eschool.fragment;


import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

import com.pierfrancescosoffritti.youtubeplayer.player.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.youtubeplayer.player.YouTubePlayer;
import com.pierfrancescosoffritti.youtubeplayer.player.YouTubePlayerInitListener;
import com.pierfrancescosoffritti.youtubeplayer.player.YouTubePlayerView;

import java.util.Observable;

import sas.eschool.Dialog.Youtube;
import sas.eschool.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LearningSuppportFragments extends Fragment {


    public LearningSuppportFragments() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_learning_suppport_fragments, container, false);

        ImageView youtube= v.findViewById(R.id.video_play);

        youtube.setOnClickListener(v1 -> {

            Youtube youtube1=new Youtube(getActivity());
            youtube1.show();
        });


//        youtube.show();


//        YouTubePlayerView youTubePlayerView = v.findViewById(R.id.youtube_player_view);
//        io.reactivex.Observable.just(youTubePlayerView)
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .doOnNext(e->{
//                    e.initialize(youTubePlayer -> youTubePlayer.loadVideo("hq3yfQnllfQ",10),true);
//                }).subscribe();

//        youTubePlayerView.initialize(initializedYouTubePlayer ->
//                initializedYouTubePlayer.addListener(new AbstractYouTubePlayerListener() {
//            @Override
//            public void onReady() {
//                String videoId = "hq3yfQnllfQ";
//                initializedYouTubePlayer.loadVideo(videoId, 10);
//            }
//        }), true);

        return v;
    }

}
