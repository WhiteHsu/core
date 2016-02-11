package com.dotcms.publisher.assets.business;

import com.dotcms.publisher.assets.bean.LastPush;
import com.dotmarketing.exception.DotDataException;

import java.util.Optional;

public interface LastPushFactory {

    Optional<LastPush> getLastPush(String assetId, String environmentId) throws DotDataException;

    void saveLastPush(LastPush asset) throws DotDataException;

    void deleteLastPushesInBundle(String bundleId, String environmentId) throws DotDataException;

    void deleteAllLastPushes() throws DotDataException;

    void deleteLastPushesByAsset(String assetId) throws DotDataException;

    void deleteLastPushesByEnvironment(String environmentId) throws DotDataException;
}