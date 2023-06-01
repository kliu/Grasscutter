// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DungeonCandidateTeamPlayerState.proto

package emu.grasscutter.net.proto;

public final class DungeonCandidateTeamPlayerStateOuterClass {
  private DungeonCandidateTeamPlayerStateOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * <pre>
   * Obf: HHJFBBFKPIE
   * </pre>
   *
   * Protobuf enum {@code DungeonCandidateTeamPlayerState}
   */
  public enum DungeonCandidateTeamPlayerState
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>DUNGEON_CANDIDATE_TEAM_PLAYER_STATE_IDLE = 0;</code>
     */
    DUNGEON_CANDIDATE_TEAM_PLAYER_STATE_IDLE(0),
    /**
     * <code>DUNGEON_CANDIDATE_TEAM_PLAYER_STATE_CHANGING_AVATAR = 1;</code>
     */
    DUNGEON_CANDIDATE_TEAM_PLAYER_STATE_CHANGING_AVATAR(1),
    /**
     * <code>DUNGEON_CANDIDATE_TEAM_PLAYER_STATE_READY = 2;</code>
     */
    DUNGEON_CANDIDATE_TEAM_PLAYER_STATE_READY(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>DUNGEON_CANDIDATE_TEAM_PLAYER_STATE_IDLE = 0;</code>
     */
    public static final int DUNGEON_CANDIDATE_TEAM_PLAYER_STATE_IDLE_VALUE = 0;
    /**
     * <code>DUNGEON_CANDIDATE_TEAM_PLAYER_STATE_CHANGING_AVATAR = 1;</code>
     */
    public static final int DUNGEON_CANDIDATE_TEAM_PLAYER_STATE_CHANGING_AVATAR_VALUE = 1;
    /**
     * <code>DUNGEON_CANDIDATE_TEAM_PLAYER_STATE_READY = 2;</code>
     */
    public static final int DUNGEON_CANDIDATE_TEAM_PLAYER_STATE_READY_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static DungeonCandidateTeamPlayerState valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static DungeonCandidateTeamPlayerState forNumber(int value) {
      switch (value) {
        case 0: return DUNGEON_CANDIDATE_TEAM_PLAYER_STATE_IDLE;
        case 1: return DUNGEON_CANDIDATE_TEAM_PLAYER_STATE_CHANGING_AVATAR;
        case 2: return DUNGEON_CANDIDATE_TEAM_PLAYER_STATE_READY;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<DungeonCandidateTeamPlayerState>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        DungeonCandidateTeamPlayerState> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<DungeonCandidateTeamPlayerState>() {
            public DungeonCandidateTeamPlayerState findValueByNumber(int number) {
              return DungeonCandidateTeamPlayerState.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.DungeonCandidateTeamPlayerStateOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final DungeonCandidateTeamPlayerState[] VALUES = values();

    public static DungeonCandidateTeamPlayerState valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private DungeonCandidateTeamPlayerState(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:DungeonCandidateTeamPlayerState)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%DungeonCandidateTeamPlayerState.proto*" +
      "\267\001\n\037DungeonCandidateTeamPlayerState\022,\n(D" +
      "UNGEON_CANDIDATE_TEAM_PLAYER_STATE_IDLE\020" +
      "\000\0227\n3DUNGEON_CANDIDATE_TEAM_PLAYER_STATE" +
      "_CHANGING_AVATAR\020\001\022-\n)DUNGEON_CANDIDATE_" +
      "TEAM_PLAYER_STATE_READY\020\002B\033\n\031emu.grasscu" +
      "tter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}