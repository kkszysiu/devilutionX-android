
cmake_minimum_required(VERSION 3.4.1)
project(SDL2_mixer)


find_library( # Sets the name of the path variable.
        GLESv1_CM
        GLESv2
        android
        z
        log
)

include_directories(
        include
        src/native_midi
        ${CMAKE_CURRENT_SOURCE_DIR}/../SDL2/include
)

add_definitions(-DGL_GLEXT_PROTOTYPES -DMUSIC_WAV)

add_library( # Sets the name of the library.
        SDL2_mixer

        # Sets the library as a shared library.
        SHARED

        src/effect_position.c
        src/effect_stereoreverse.c
        src/effects_internal.c
        src/load_aiff.c
        src/load_voc.c
        src/mixer.c
        src/music.c
        src/music_cmd.c
        src/music_flac.c
        src/music_fluidsynth.c
        src/music_mad.c
        src/music_mikmod.c
        src/music_modplug.c
        src/music_mpg123.c
        src/music_nativemidi.c
        src/music_ogg.c
        src/music_opus.c
        src/music_wav.c
        #src/playmus.c
        #src/playwave.c
        src/native_midi/native_midi_common.c
        )


target_link_libraries(
        SDL2_mixer
        SDL2
        GLESv1_CM
        GLESv2
        android
        z
        log
)