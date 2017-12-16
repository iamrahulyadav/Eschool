package sas.eschool.Dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.Window;

import com.pierfrancescosoffritti.youtubeplayer.player.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.youtubeplayer.player.YouTubePlayerView;

import sas.eschool.R;

/**
 * Created by CodeCrazy on 12/16/17.
 */

public class Youtube extends Dialog {
    YouTubePlayerView youTubePlayerView;
    public Youtube(@NonNull Context context) {
        super(context);
        setCancelable(true);
        getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.youtubeview);
         youTubePlayerView = findViewById(R.id.youtube_player_view);

        youTubePlayerView.initialize(initializedYouTubePlayer ->
                initializedYouTubePlayer.addListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady() {
                String videoId = "hq3yfQnllfQ";
                initializedYouTubePlayer.loadVideo(videoId, 10);
            }
        }), true);

    }


}
